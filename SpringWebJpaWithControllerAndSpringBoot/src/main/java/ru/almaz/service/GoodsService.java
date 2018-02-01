package ru.almaz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import ru.almaz.models.Goods;
import ru.almaz.models.GoodsStatus;
import ru.almaz.models.Order;
import ru.almaz.models.OrderStatus;
import ru.almaz.repositories.GoodsRepository;
import ru.almaz.repositories.OrderRepository;
import ru.almaz.repositories.UserRepository;
import sun.plugin.liveconnect.SecurityContextHelper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class GoodsService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private GoodsRepository goodsRepository;

    public Order getBasket() {
        return orderRepository.findByUser_UserLoginAndOrderStatus(
                SecurityContextHolder.getContext().getAuthentication().getName(), OrderStatus.OPEN
        ).orElseGet(() -> {
            Order order = Order.builder()
                    .orderStatus(OrderStatus.OPEN)
                    .user(userRepository.findByUserLogin(SecurityContextHolder.getContext().getAuthentication().getName()).get())
                    .goods(new ArrayList<>())
                    .time(LocalDateTime.now())
                    .build();
            orderRepository.save(order);
            return order;
        });
    }

    public void setStatusByGoods(Long id, GoodsStatus status) {

        if (userService.isUserByModerator() || userService.isUserbyAdmin()) {
            Goods goods = goodsRepository.findOne(id);
            goods.setStatus(status);
            goodsRepository.save(goods);
        }


    }
}