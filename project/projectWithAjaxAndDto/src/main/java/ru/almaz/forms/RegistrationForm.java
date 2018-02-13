package ru.almaz.forms;

import lombok.Data;

@Data
public class RegistrationForm {
    private String userLogin;
    private String email;
    private String userPassword;
    private String address;
    private String telephone;
}
