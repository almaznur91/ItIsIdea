package ru.almaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.almaz.repositories.GoodsRepository;

@Controller
public class BasketController {

    @Autowired
    private GoodsRepository repository;

    @GetMapping("/basket")
    public String getGoodsPage(@ModelAttribute("model") ModelMap model) {

        model.addAttribute("goods", repository.findAll());
        return "basket_page";
    }


}
