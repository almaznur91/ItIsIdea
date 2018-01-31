package ru.almaz.service;

import ru.almaz.forms.RegistrationForm;

import javax.mail.MessagingException;

public interface RegistrationService {
    void registrationUser(RegistrationForm form) throws MessagingException;

    boolean confirmUser(String confirmString);
}
