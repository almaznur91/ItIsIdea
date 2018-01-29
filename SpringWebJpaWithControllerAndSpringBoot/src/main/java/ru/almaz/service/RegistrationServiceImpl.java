package ru.almaz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.almaz.forms.RegistrationForm;
import ru.almaz.models.State;
import ru.almaz.models.User;
import ru.almaz.repositories.UserRepository;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Component
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    private EmailService emailService;

    @Override
    public void registrationUser(RegistrationForm form) {
        String confirmString = UUID.randomUUID().toString();

        User newUser = User.builder()
                .userLogin(form.getUserLogin())
                .email(form.getEmail())
                .userPassword(passwordEncoder.encode(form.getUserPassword()))
                .registrationDate(LocalDateTime.now())
                .state(State.NOT_CONFIRMED)
                .confirmString(confirmString)
                .build();

        String mailText = "<a href=\"http://localhost:8080/confirm/" + confirmString + "\">Подвтердить</a>";

        emailService.sendMail(newUser.getEmail(),"Подтверждение регистрации", mailText );

        userRepository.save(newUser);
    }

    @Override
    public boolean confirmUser(String confirmString) {
        Optional<User> userOptional = userRepository.findByConfirmString(confirmString);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setConfirmString(null);
            user.setState(State.CONFIRMED);
            userRepository.save(user);
            return true;
        } else {
            return false;
        }    }
}
