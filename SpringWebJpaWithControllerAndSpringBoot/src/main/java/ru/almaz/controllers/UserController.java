package ru.almaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.almaz.models.User;
import ru.almaz.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.jws.WebParam;
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