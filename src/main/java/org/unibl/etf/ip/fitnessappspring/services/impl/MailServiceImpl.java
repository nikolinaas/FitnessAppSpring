package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.services.MailService;
import org.springframework.mail.javamail.JavaMailSender;

import java.nio.file.Files;
import java.nio.file.Path;

@Service
@Transactional
public class MailServiceImpl implements MailService {
    private final JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String fromMail;
    @Value("${spring.mail.password}")
    private String pass;
    @Value("${account.verification.url}")
    private String accountVerificationUrl;

    public MailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Async
    @Override
    public void sendVerificationEmail(String to) throws MessagingException {
System.out.println(fromMail);
        System.out.println(pass);
        try{
            MimeMessage message = mailSender.createMimeMessage();

            var helper = new MimeMessageHelper(message, true);

            helper.setSubject("Account verification, Online Fitness");

           ClassPathResource htmlPath = new ClassPathResource("AccountVerification.html");
            var html= Files.readString(Path.of(htmlPath.getFile().getAbsolutePath()));
            html=html.replace("validation.url",accountVerificationUrl+"token");

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
}
