package ru.almaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import ru.almaz.models.Goods;
import ru.almaz.models.Order;
import ru.almaz.repositories.GoodsRepository;
import ru.almaz.repositories.OrderRepository;

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

    @GetMapping("/goods")
    public String getGoodsPage(@RequestParam(value = "add",required = false) String add,
                               @ModelAttribute("model") ModelMap model) {
        if (add!=null){
            Order order = Order.builder()
                    .time(LocalDateTime.now())
                    .number(3)
                    .build();
            Goods goods = goodsRepository.findOne(1L);
            goods.getOrders().add(order);
            orderRepository.save(order);
            goodsRepository.save(goods);
            System.out.println(order.getGoods().size());

        }
        model.addAttribute("goods", goodsRepository.findAll());
        return "goods_page";
    }

    @GetMapping("/goods/delete")
    public String deleteGoods(@RequestParam("id") Long id,
                              @RequestParam()
                              @ModelAttribute("model") ModelMap model,
                              Authentication authentication,
                              HttpServletRequest request,
                              HttpServletResponse response) {
        goodsRepository.delete(id);
        model.addAttribute("goods", goodsRepository.findAll());
        return "goods_page";
    }


}
