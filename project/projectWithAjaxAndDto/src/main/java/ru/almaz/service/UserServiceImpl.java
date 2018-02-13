package ru.almaz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import ru.almaz.dto.UserDto;
import ru.almaz.models.Order;
import ru.almaz.models.OrderStatus;
import ru.almaz.models.Role;
import ru.almaz.models.User;
import ru.almaz.repositories.OrderRepository;
import ru.almaz.repositories.UserRepository;
import ru.almaz.security.details.UserDetailsImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Service
public class UserServiceImpl {


    @Autowired
    private UserRepository userRepository;




    public boolean isUserByModerator(Authentication authentication) {

        User user = ((UserDetailsImpl)authentication.getPrincipal()).getUser();

        return user.getRole() == Role.MODERATOR;
    }

    public boolean isUserbyAdmin(Authentication authentication) {
        User user = ((UserDetailsImpl)authentication.getPrincipal()).getUser();

        return user.getRole() == Role.ADMIN;

    }

    public boolean isUserbyUser(Authentication authentication){
        User user= ((UserDetailsImpl)authentication.getPrincipal()).getUser();

        return user.getRole() == Role.USER;
    }

    public boolean isUserByOperator(Authentication authentication){
        User user = ((UserDetailsImpl)authentication.getPrincipal()).getUser();
        return user.getRole()==Role.OPERATOR;
    }

    public void setUserRole(Long id, Role role,Authentication authentication){
        if (isUserbyAdmin(authentication)){
            User user = userRepository.findOne(id);
            user.setRole(role);
            userRepository.save(user);
        }
    }
    public User getUser(Authentication authentication){
        User user = ((UserDetailsImpl)authentication.getPrincipal()).getUser();
        return user;
    }


}
