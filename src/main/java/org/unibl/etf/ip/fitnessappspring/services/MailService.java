package org.unibl.etf.ip.fitnessappspring.services;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

public interface MailService {
    @Async
    void sendVerificationEmail(String to, String verificationCode) throws MessagingException;

    @Async
    @Scheduled(cron = "0 30 20 * * ?")
    void sendMailForNewProgram();
}
