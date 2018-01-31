package ru.almaz.service;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    @SneakyThrows
    public void sendMail(String email, String subject, String text) throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        message.setContent("first", "text/html");
        MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
        messageHelper.setTo("zagirnur@gmail.com");
        messageHelper.setSubject("second");
        messageHelper.setText("third", true);
        javaMailSender.send(message);
    }
}