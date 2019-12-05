package com.techcaresinc.technoreply.services;

import com.techcaresinc.technoreply.beans.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail (final Mail mail) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setFrom(mail.getFrom());
        mailMessage.setTo(mail.getTo());
        mailMessage.setSubject(mail.getSubject());
        mailMessage.setText(mail.getContent());

        mailSender.send(mailMessage);
    }
}
