package ru.almaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.almaz.repositories.UserRepository;

@Controller
public class ProfileController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/profile")
    public String getProfilePage(ModelMap model,Authentication authentication){
        model.addAttribute("username", authentication.getName());
        return "profile";
    }

}
