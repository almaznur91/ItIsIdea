package ru.almaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import ru.almaz.forms.RegistrationForm;
import ru.almaz.models.Role;
import ru.almaz.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.almaz.service.UserServiceImpl;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/users")
    public String getUsersPage(@ModelAttribute("model") ModelMap model) {
        model.addAttribute("users", userRepository.findAll());
        return "users_page";
    }

    @GetMapping("/users/changeRole")
    public String changeRole(@RequestParam(value = "id", required = false) Long id) {

        if (userService.isUserbyAdmin() && (userRepository.getOne(id).getRole() == Role.USER)) {
            userService.setUserRole(id, Role.MODERATOR);
            return "redirect:/users";

        }else if (userService.isUserbyAdmin() && (userRepository.getOne(id).getRole() == Role.MODERATOR)) {
            userService.setUserRole(id, Role.USER);
            return "redirect:/users";

        }
        else

        return "redirect:/users";
    }


//    @RequestMapping(value = "/users", method = RequestMethod.POST)
//    public ModelAndView addUser(@ModelAttribute User user){
//    userRepository.save(user);
//    return new ModelAndView("redirect:/users");
//    }
//    @RequestMapping(value = "/users",method = RequestMethod.POST)
//    public ModelAndView
}