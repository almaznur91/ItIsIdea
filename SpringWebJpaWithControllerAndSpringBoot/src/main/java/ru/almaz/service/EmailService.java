package ru.almaz.service;

public interface EmailService {
    void sendMail(String email, String subject, String text);
}
