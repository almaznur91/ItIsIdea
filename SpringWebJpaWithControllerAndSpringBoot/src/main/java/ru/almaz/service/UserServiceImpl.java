package ru.almaz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import ru.almaz.models.Order;
import ru.almaz.models.OrderStatus;
import ru.almaz.models.Role;
import ru.almaz.models.User;
import ru.almaz.repositories.OrderRepository;
import ru.almaz.repositories.UserRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Service
public class UserServiceImpl {


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServiceImpl userService;

    public boolean isUserByModerator() {

        User user = userRepository.findByUserLogin(SecurityContextHolder.
                getContext().
                getAuthentication().
                getName()).
                orElseThrow(IllegalArgumentException::new);

        if (user.getRole() == Role.MODERATOR) {
            return true;

        } else return false;
    }

    public boolean isUserbyAdmin() {
        User user = userRepository.findByUserLogin(SecurityContextHolder.
                getContext().
                getAuthentication().
                getName()).
                orElseThrow(IllegalArgumentException::new);

        if (user.getRole() == Role.ADMIN) {
            return true;

        } else return false;

    }

    public boolean isUserbyUser(){
        User user= userRepository.
                findByUserLogin(SecurityContextHolder.
                        getContext().
                        getAuthentication().
                        getName()).
                orElseThrow(IllegalArgumentException::new);

        if (user.getRole()==Role.USER){
            return true;}

        else return false;
    }

    public void setUserRole(Long id, Role role){
        if (userService.isUserbyAdmin()){
            User user = userRepository.findOne(id);
            user.setRole(role);
            userRepository.save(user);
        }
    }


}
