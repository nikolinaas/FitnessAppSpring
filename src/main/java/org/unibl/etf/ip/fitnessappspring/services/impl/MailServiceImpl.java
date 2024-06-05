package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.models.entities.PretplataEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.ProgramEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.PretplataEntityRepository;
import org.unibl.etf.ip.fitnessappspring.repositories.ProgramEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.MailService;
import org.springframework.mail.javamail.JavaMailSender;
import jakarta.mail.internet.MimeMessage;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class MailServiceImpl implements MailService {
    private final JavaMailSender mailSender;
private final PretplataEntityRepository pretplataEntityRepository;
private final ProgramEntityRepository programEntityRepository;
    @Value("${spring.mail.username}")
    private String fromMail;
    @Value("${spring.mail.password}")
    private String pass;
    @Value("${account.verification.url}")
    private String accountVerificationUrl;

    public MailServiceImpl(JavaMailSender mailSender, PretplataEntityRepository pretplataEntityRepository, ProgramEntityRepository programEntityRepository) {
        this.mailSender = mailSender;
        this.pretplataEntityRepository = pretplataEntityRepository;
        this.programEntityRepository = programEntityRepository;
    }

    @Async
    @Override
    public void sendVerificationEmail(String to, String verificationCode) throws MessagingException {
System.out.println(fromMail);
        System.out.println(pass);
        try{
            MimeMessage message = mailSender.createMimeMessage();

            var helper = new MimeMessageHelper(message, true);

            helper.setSubject("Account verification, Online Fitness");

           ClassPathResource htmlPath = new ClassPathResource("AccountVerification.html");
            var html= Files.readString(Path.of(htmlPath.getFile().getAbsolutePath()));
            html=html.replace("verificationCode",verificationCode);

            helper.setText(html,true);
            helper.setFrom(fromMail);
            helper.setTo(to);

            this.mailSender.send(message);
            System.out.println("message");
     //       logService.info("New verification mail sent! To: " + to + ".");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch u servisu");
            throw new RuntimeException(e);
        }
    }


    @Override
    @Async
    @Scheduled(cron = "0 15 10 * * ?")
    public void sendMailForNewProgram() {
        List<PretplataEntity> subscriptions = pretplataEntityRepository.findAll();
        LocalDate currentDate = LocalDate.now();
        LocalDateTime startOfYesterday = LocalDateTime.of(currentDate, LocalTime.MIN);
        Date startDate = Date.from(startOfYesterday.atZone(ZoneId.systemDefault()).toInstant());
        LocalDateTime endOfYesterday = LocalDateTime.of(currentDate, LocalTime.MAX);
        Date endDate = Date.from(endOfYesterday.atZone(ZoneId.systemDefault()).toInstant());

        subscriptions.forEach(el -> {
            try {
                List<ProgramEntity> fitnessPrograms = programEntityRepository.getAllByKategorijaIdkategorija(el.getKategorijaIdkategorija());


                MimeMessage message = mailSender.createMimeMessage();

                var helper = new MimeMessageHelper(message, true);




                



                this.mailSender.send(message);
                helper.setSubject("Notification, new fitness programs for category: " + el.getKategorijaByKategorijaIdkategorija().getNazivKategorija());
                if(fitnessPrograms.size() != 0) {
                    String text = "Fitness programs:\n\n";
                    for (var fp : fitnessPrograms) {
                        text = text + "\t * " + fp.getNazivPrograma() + "\n";
                    }
                    helper.setText(text);
                }else{
                    helper.setText("There are no new fitness programs created today!");
                }
                helper.setFrom(fromMail);
                helper.setTo(el.getKorisnikByKorisnikId().getEmail());
                this.mailSender.send(message);

            }catch(Exception e){
                throw new RuntimeException(e);
            }
        });
    }
}
