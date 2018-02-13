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

    @GetMapping("/operator")
    public String getOperatorPage(@ModelAttribute("model")  ModelMap model, Authentication authentication){
        if (userService.isUserbyAdmin(authentication)||userService.isUserByOperator(authentication)){
        model.addAttribute("orders",orderService.getOrdersForOperator());
            model.addAttribute("operator",true);
        }
        return "operator_page";
    }
    @GetMapping("/operator/showGoods")
    public String showGodsByOrder(@RequestParam(value = "id",required = false) Long id,
                                  @ModelAttribute("model") ModelMap model){
        Order order = orderRepository.findOne(id);
        UserDto user = UserDto.from(order.getUser());
        model.addAttribute("order",order);
        model.addAttribute("goods",order.getGoods());
        model.addAttribute("operator",true);
        model.addAttribute("user",user);
        return "goods_page";
    }

    @PostMapping("/operator/changeOrderStatus")
    @ResponseBody
    public OrderDto changeOrderStatus(@RequestParam(value = "id",required = false) Long id,
                                      @ModelAttribute("model") ModelMap model,
                                      HttpServletResponse response
                                  ) {
        model.addAttribute("operator",true);

        Order order = orderRepository.findOne(id);
        orderService.changeOrderStatus(order);
        return OrderDto.builder().id(String.valueOf(id)).orderStatus(order.getOrderStatus().toString()).build();

    }

    @GetMapping("/profile/orders")
    public String getOrdersPage(Authentication authentication,
                                @ModelAttribute("model") ModelMap model){
        User user = userService.getUser(authentication);
        model.addAttribute("user",true);
        model.addAttribute("orders",orderService.getOrderforUser(user));
        return "operator_page";
    }
}
