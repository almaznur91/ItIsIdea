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

import java.time.LocalDateTime;
import java.util.Optional;

@Controller
public class BasketController {

    @Autowired
    private GoodsRepository goodsRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    GoodsService goodsService;

    @GetMapping("/basket")
    public String getGoodsPage(ModelMap model
                                ) {
//       Optional <User> userOptional = userRepository.findByUserLogin(authentication.getName());
//
//       if(userOptional.isPresent()) {
//
//       }

        model.addAttribute("order", goodsService.getBasket());
        return "basket_page";
    }

    @GetMapping("basket/delete")
    public String deleteGoodByBasket(@RequestParam(value = "id", required = false) Integer id){
        Order order = goodsService.getBasket();
        order.getGoods().remove(id.intValue()).getOrders().remove(order);
        orderRepository.save(order);
    return "redirect:/basket";
    }

}
