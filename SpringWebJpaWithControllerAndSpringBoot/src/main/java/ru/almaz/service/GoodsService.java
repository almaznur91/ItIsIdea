package ru.almaz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import ru.almaz.models.Order;
import ru.almaz.models.OrderStatus;
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
}
