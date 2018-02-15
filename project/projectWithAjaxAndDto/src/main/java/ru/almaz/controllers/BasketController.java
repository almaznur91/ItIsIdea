package ru.almaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import ru.almaz.models.*;
import ru.almaz.repositories.GoodsRepository;
import ru.almaz.repositories.OrderRepository;
import ru.almaz.repositories.UserRepository;
import ru.almaz.service.GoodsService;
import ru.almaz.service.OrderServiceImpl;

import java.time.LocalDateTime;
import java.util.Optional;

@Controller
public class BasketController {


    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private GoodsRepository goodsRepository;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private OrderServiceImpl orderService;


    @GetMapping("/basket")
    public String getGoodsPage(ModelMap model) {

        model.addAttribute("order", goodsService.getBasket());
        model.addAttribute("sum", goodsService.getAllPriceInBasket());
        return "basket_page";
    }

    @GetMapping("basket/delete")
    public String deleteGoodByBasket(@RequestParam(value = "id", required = false) Long id) {
        orderService.deleteGoodByBasket(id);
        return "redirect:/basket";
    }


    @GetMapping("/goods/add_to_basket")
    public String getGoodsPage(@RequestParam(value = "id", required = false) Long id) {
        orderService.addGoodToOrder(id);
        return "redirect:/goods";
    }

    @GetMapping("/showGoods")
    public String getGoodsPage1(@RequestParam(value = "id", required = false) Long id) {
        orderService.addGoodToOrder(id);
        return "redirect:/goods";
    }

    @GetMapping("/checkout")
    public String setOrderStatusProcessing(ModelMap model) {
        Order order =orderService.getOrderStatusCheckout();
        model.addAttribute("order", order);
        model.addAttribute("sum", goodsService.getSumPriceInOrder(order.getId()));
        return "successful_order_page";

    }


}

