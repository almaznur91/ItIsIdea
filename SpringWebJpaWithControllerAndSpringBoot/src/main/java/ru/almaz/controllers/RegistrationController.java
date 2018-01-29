package ru.almaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.almaz.forms.RegistrationForm;
import ru.almaz.service.RegistrationService;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService service;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "sign_up";
    }

    @PostMapping("signUp")
    public String registrationUser(@ModelAttribute RegistrationForm form){
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