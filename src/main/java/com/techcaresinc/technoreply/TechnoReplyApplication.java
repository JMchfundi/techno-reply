package com.techcaresinc.technoreply;

import com.techcaresinc.technoreply.beans.Mail;
import com.techcaresinc.technoreply.services.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechnoReplyApplication implements ApplicationRunner {

    private static Logger logger = LoggerFactory.getLogger(TechnoReplyApplication.class);

    @Autowired
    private MailService mailService;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TechnoReplyApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("techno-reply sample mail");

        Mail mail = new Mail();

        mail.setFrom("Jakida@techcaresinc.com");
        mail.setTo("akidamjaffar@gmail.com");
        mail.setSubject("techno-reply mail service");
        mail.setContent("Hi Jafari M Akida, if you see this then we are set to go");

        mailService.sendMail(mail);
    }
}
