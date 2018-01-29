package ru.almaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import ru.almaz.forms.RegistrationForm;
import ru.almaz.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public String getUsersPage(@ModelAttribute("model") ModelMap model) {
        model.addAttribute("users",userRepository.findAll());
        return "users_page";
    }

//    @RequestMapping(value = "/users", method = RequestMethod.POST)
//    public ModelAndView addUser(@ModelAttribute User user){
//    userRepository.save(user);
//    return new ModelAndView("redirect:/users");
//    }
//    @RequestMapping(value = "/users",method = RequestMethod.POST)
//    public ModelAndView
}