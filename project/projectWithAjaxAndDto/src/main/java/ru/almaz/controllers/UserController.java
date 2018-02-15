package ru.almaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.ui.ModelMap;
import ru.almaz.forms.RegistrationForm;
import ru.almaz.models.Role;
import ru.almaz.models.State;
import ru.almaz.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.almaz.service.OrderServiceImpl;
import ru.almaz.service.UserServiceImpl;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private OrderServiceImpl orderService;

    @GetMapping("/users")
    public String getUsersPage(@ModelAttribute("model") ModelMap model) {
        model.addAttribute("users", userRepository.findAll());
        return "users_page";
    }

    @GetMapping("/users/changeRole")
    public String changeRole(@RequestParam(value = "id", required = false) Long id, Authentication authentication) {

        if (userService.isUserbyAdmin(authentication) && (userRepository.getOne(id).getRole() == Role.USER)) {
            userService.setUserRole(id, Role.MODERATOR,authentication);
            return "redirect:/users";

        }else if (userService.isUserbyAdmin(authentication) && (userRepository.getOne(id).getRole() == Role.MODERATOR)) {
            userService.setUserRole(id, Role.OPERATOR,authentication);
            return "redirect:/users";

        }
        else if (userService.isUserbyAdmin(authentication) && (userRepository.getOne(id).getRole() == Role.OPERATOR)) {
            userService.setUserRole(id, Role.USER,authentication);
            return "redirect:/users";}

        else

        return "redirect:/users";
    }



    @GetMapping("/users/changeState")
    public String changeState(@RequestParam(value = "id", required = false) Long id, Authentication authentication) {

        if (userService.isUserbyAdmin(authentication) && (userRepository.getOne(id).getState() == State.CONFIRMED)) {
            userService.setUserState(id, State.BUNED,authentication);
            return "redirect:/users";

        }else if (userService.isUserbyAdmin(authentication) && (userRepository.getOne(id).getState() == State.BUNED)) {
            userService.setUserState(id, State.DELETED,authentication);
            return "redirect:/users";

        }
        else if (userService.isUserbyAdmin(authentication) && (userRepository.getOne(id).getState() == State.DELETED)) {
            userService.setUserState(id, State.CONFIRMED,authentication);
            return "redirect:/users";}

        else

            return "redirect:/users";
    }

    @GetMapping(value = "/editUser")
    public String editUser(Authentication authentication, ModelMap model) {
        model.addAttribute("user", userService.getUser(authentication));
        return "user_edit";
    }




//    @RequestMapping(value = "/users", method = RequestMethod.POST)
//    public ModelAndView addUser(@ModelAttribute User user){
//    userRepository.save(user);
//    return new ModelAndView("redirect:/users");
//    }
//    @RequestMapping(value = "/users",method = RequestMethod.POST)
//    public ModelAndView
}