package ru.almaz.service;

import javax.mail.MessagingException;

public interface EmailService {
    void sendMail(String email, String subject, String text) throws MessagingException;
}
