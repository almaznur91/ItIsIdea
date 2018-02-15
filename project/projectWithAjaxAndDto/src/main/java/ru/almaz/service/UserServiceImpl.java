package ru.almaz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.almaz.dto.UserDto;
import ru.almaz.models.*;
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
        User user = userRepository.findByUserLogin(authentication.getName()).orElseThrow(()->new UsernameNotFoundException("Пользователь не найден"));
        return user;
    }

    public void setUserState(Long id, State state, Authentication authentication){
        if (isUserbyAdmin(authentication)){
            User user=userRepository.findOne(id);
            user.setState(state);
            userRepository.save(user);
        }
    }





}
