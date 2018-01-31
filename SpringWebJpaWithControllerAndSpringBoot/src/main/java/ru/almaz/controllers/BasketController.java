package ru.almaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.almaz.models.Order;
import ru.almaz.models.OrderStatus;
import ru.almaz.repositories.GoodsRepository;
import ru.almaz.repositories.UserRepository;

import java.time.LocalDateTime;

@Controller
public class BasketController {

    @Autowired
    private GoodsRepository goodsRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/basket")
    public String getGoodsPage(@ModelAttribute("model") ModelMap model,
                               Authentication authentication){
        model.addAttribute("goods", userRepository.findByUserLogin(authentication.getName()));

        if (goods.getOrders()!=null) {
            Order order = Order.builder()
                    .time(LocalDateTime.now())
                    .number(4)
                    .orderStatus(OrderStatus.OPEN)
                    .build();
            goods.getOrders().add(order);
            orderRepository.save(order);
            goodsRepository.save(goods);
        }
        return "basket_page";
    }


}
