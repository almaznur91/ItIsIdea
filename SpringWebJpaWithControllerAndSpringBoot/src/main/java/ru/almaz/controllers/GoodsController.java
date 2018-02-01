package ru.almaz.controllers;

import com.google.common.annotations.GwtCompatible;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.almaz.forms.AddGoodsForm;
import ru.almaz.models.*;
import ru.almaz.repositories.GoodsRepository;
import ru.almaz.repositories.OrderRepository;
import ru.almaz.security.details.UserDetailsImpl;
import ru.almaz.service.AddGoodsService;
import ru.almaz.service.GoodsService;
import ru.almaz.service.OrderServiceImpl;
import ru.almaz.service.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class GoodsController {

    @Autowired
    private GoodsRepository goodsRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private AddGoodsService service;
    @Autowired
    private OrderServiceImpl orderService;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/goods")
    public String getGoodsPage(@ModelAttribute("model") ModelMap model) {

        if (userService.isUserByModerator() || userService.isUserbyAdmin()) {
            model.addAttribute("goods", goodsRepository.findAll());
            return "goods_page_for_moderator";
        } else {
            model.addAttribute("goods", goodsRepository.findAllByConfimed());
        }
        return "goods_page";
    }


    @GetMapping("/goods/delete")
    public String deleteGoods(@RequestParam(value = "id", required = false) Long id) {
        goodsService.setStatusByGoods(id, GoodsStatus.NOT_CONFIRMED);
        return "redirect:/goods";
    }

    @GetMapping("/goods/publish")
    public String publishGoods(@RequestParam(value = "id", required = false) Long id) {
        goodsService.setStatusByGoods(id, GoodsStatus.CONFIRMED);
        return "redirect:/goods";
    }

    @GetMapping("/addGoods")
    public String getSignUpPage() {
        return "/add_goods";
    }


    @PostMapping("/addGoods")
    public String addGoods(@ModelAttribute AddGoodsForm form) {
        if (userService.isUserbyAdmin() || userService.isUserByModerator()) {
            service.addGoods(form);
        }
        return "redirect:/goods";
    }


}
