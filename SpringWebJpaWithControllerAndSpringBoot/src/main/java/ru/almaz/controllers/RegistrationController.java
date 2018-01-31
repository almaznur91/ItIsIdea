package ru.almaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.almaz.forms.RegistrationForm;
import ru.almaz.service.RegistrationService;

import javax.mail.MessagingException;
import java.util.Optional;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService service;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "sign_up";
    }

    @GetMapping("/signIn")
    public String getSignInPage(@ModelAttribute("model") ModelMap model,
                                @RequestParam(value = "error", required = false) String error) {
        if (error != null) {
            model.addAttribute("error", true);
        }
        return "sign_in";
    }


    @PostMapping("/signUp")
    public String registrationUser(@ModelAttribute RegistrationForm form) throws MessagingException {
        service.registrationUser(form);
        return "success_sign_up";
    }


    @GetMapping("/confirm/{confirm-string}")//кусок вытащит и положит в переменную, внизу
    public String getConfirmPage(@PathVariable("confirm-string") String confirmString,
                                 @ModelAttribute("model") ModelMap model) {
        boolean confirmResult = service.confirmUser(confirmString);
        model.addAttribute("confirmResult", confirmResult);
        return "confirm_result";

    }




//    @RequestMapping(value = "/users", method = RequestMethod.POST)
//    public ModelAndView addUser(@ModelAttribute User user){
//    userRepository.save(user);
//    return new ModelAndView("redirect:/users");
//    }
//    @RequestMapping(value = "/users",method = RequestMethod.POST)
//    public ModelAndView
}