package ru.almaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.almaz.models.User;
import ru.almaz.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView getUsersPage() {
        ModelAndView modelAndView = new ModelAndView("users_page");
        modelAndView.addObject("users", userRepository.findAll());
        return modelAndView;
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute User user){
    userRepository.save(user);
    return new ModelAndView("redirect:/users");
    }
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public ModelAndView
}