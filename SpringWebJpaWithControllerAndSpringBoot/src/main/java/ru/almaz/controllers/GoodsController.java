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

    @GetMapping("/goods")
    public String getGoodsPage(@ModelAttribute("model") ModelMap model) {

        model.addAttribute("goods", goodsRepository.findAllByConfimed());
        return "goods_page";
    }

    @GetMapping("/goods/add_to_basket")
    public String getGoodsPage(@RequestParam(value = "id", required = false) Long id,
                               @ModelAttribute("model") ModelMap model) {

        Goods goods = goodsRepository.findOne(id);
        if (goods.getOrders() != null) {
            Order order = Order.builder()
                    .time(LocalDateTime.now())
                    .number(4)
                    .orderStatus(OrderStatus.OPEN)
                    .build();
            goods.getOrders().add(order);
            orderRepository.save(order);
            goodsRepository.save(goods);
        }

        model.addAttribute("goods", goodsRepository.findAllByConfimed());
        return "goods_page";
    }


//    @GetMapping("/basket")
//    public String getBasketPage(){
//        return "/basket";
//    }


    @GetMapping("/goods/delete")
    public String deleteGoods(@RequestParam(value = "id", required = false) Long id,
                              @ModelAttribute("model") ModelMap model) {
        Goods goods = goodsRepository.findOne(id);
        goods.setStatus(GoodsStatus.NOT_CONFIRMED);
        goodsRepository.save(goods);
        model.addAttribute("goods", goodsRepository.findAllByConfimed());
        return "goods_page";
    }

    @GetMapping("/addGoods")
    public String getSignUpPage() {
        return "/add_goods";
    }


    @PostMapping("/addGoods")
    public String addGoods(@ModelAttribute AddGoodsForm form,
                           @ModelAttribute("model") ModelMap model,
                           Authentication authentication) {
        if (((UserDetailsImpl)authentication.getPrincipal()).getUser().getRole().equals(Role.MODERATOR))
        service.addGoods(form);
        model.addAttribute("goods", goodsRepository.findAll());
        return "redirect:/goods";
    }


}
