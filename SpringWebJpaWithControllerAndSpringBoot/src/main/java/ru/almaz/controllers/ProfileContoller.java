package ru.almaz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileContoller {
    @GetMapping("/profile")
    public String getProfilePage(){
        return "profile";
    }


}
