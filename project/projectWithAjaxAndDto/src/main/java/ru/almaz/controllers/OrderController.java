package ru.almaz.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.almaz.dto.OrderDto;
import ru.almaz.dto.UserDto;
import ru.almaz.models.Order;
import ru.almaz.models.User;
import ru.almaz.repositories.OrderRepository;
import ru.almaz.service.GoodsService;
import ru.almaz.service.OrderServiceImpl;
import ru.almaz.service.UserServiceImpl;

import javax.servlet.http.HttpServletResponse;

@Controller
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/operator")
    public String getOperatorPage(@ModelAttribute("model")  ModelMap model, Authentication authentication){
            model.addAttribute("operator",true);
            model.addAttribute("orders",orderService.getOrdersForOperator());

        return "operator_page";
    }
    @GetMapping("/operator/showGoods")
    public String showGodsByOrder(@RequestParam(value = "id",required = false) Long id,
                                  @ModelAttribute("model") ModelMap model){
        Order order = orderRepository.findOne(id);
        model.addAttribute("sumbyorder",goodsService.getSumPriceInOrder(id));
        System.out.println(goodsService.getSumPriceInOrder(id));
        model.addAttribute("order",order);
        model.addAttribute("goods",order.getGoods());
        model.addAttribute("operator",true);
        model.addAttribute("user",UserDto.from(order.getUser()));
        return "goods_page";
    }

    @PostMapping("/operator/changeOrderStatus")
    @ResponseBody
    public OrderDto changeOrderStatus(@RequestParam(value = "id",required = false) Long id,
                                      @ModelAttribute("model") ModelMap model,
                                      HttpServletResponse response
                                  ) {
        model.addAttribute("operator",true);
        return orderService.changeOrderStatusByController(id);


    }

    @GetMapping("/orders")
    public String getOrdersPage(Authentication authentication,
                                @ModelAttribute("model") ModelMap model){
        model.addAttribute("user",true);
        model.addAttribute("orders",orderService.getOrderforUser(authentication));
        return "operator_page";
    }
}
