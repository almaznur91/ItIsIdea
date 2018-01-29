package ru.almaz.service;

import ru.almaz.forms.RegistrationForm;

public interface RegistrationService {
    void registrationUser(RegistrationForm form);

    boolean confirmUser(String confirmString);
}
