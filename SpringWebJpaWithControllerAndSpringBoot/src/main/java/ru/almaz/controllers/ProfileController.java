package ru.almaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.almaz.models.Role;
import ru.almaz.repositories.GoodsRepository;
import ru.almaz.repositories.UserRepository;
import ru.almaz.security.details.UserDetailsImpl;
import ru.almaz.service.UserServiceImpl;

@Controller
public class ProfileController {


    @Autowired
    private GoodsRepository goodsRepository;
    @Autowired
    private UserServiceImpl userService;


    @GetMapping("/profile")
    public String getProfilePage(ModelMap model,Authentication authentication){
        model.addAttribute("username", authentication.getName());
        return "profile";
    }


    @GetMapping("/profile/goods")
    public String getGoodsPageProfile(@ModelAttribute("model") ModelMap model,
                               Authentication authentication){

        if (userService.isUserByModerator()||userService.isUserbyAdmin()){
            model.addAttribute("goods", goodsRepository.findAll());
            return "goods_page_for_moderator";
        }

        else {
            model.addAttribute("goods",goodsRepository.findAllByConfimed());
            return "goods_page";
        }


    }


}
