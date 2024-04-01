package org.unibl.etf.ip.fitnessappspring.services;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
public interface MailService {
    @Async
    void sendVerificationEmail(String to) throws MessagingException;
}
