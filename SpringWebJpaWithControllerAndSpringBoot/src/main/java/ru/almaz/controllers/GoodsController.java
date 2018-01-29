package ru.almaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import ru.almaz.repositories.GoodsRepository;

@Controller
public class GoodsController {

    @Autowired
    private GoodsRepository goodsRepository;

    @GetMapping("/goods")
    public String getGoodsPage(@ModelAttribute("model") ModelMap model) {
        model.addAttribute("goods", goodsRepository.findAll());
        return "goods_page";
    }

    @GetMapping("/goods/delete")
    public String deleteGoods(@RequestParam("id") Long id,
                              @ModelAttribute("model") ModelMap model) {
        goodsRepository.delete(id);
        model.addAttribute("goods",goodsRepository.findAll());
        return "goods_page";
    }


}
