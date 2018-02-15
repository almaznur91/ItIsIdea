package ru.almaz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import ru.almaz.dto.GoodsDto;
import ru.almaz.forms.UpdateGoodsForm;
import ru.almaz.models.*;
import ru.almaz.repositories.GoodsRepository;
import ru.almaz.repositories.OrderRepository;
import ru.almaz.repositories.UserRepository;
import sun.plugin.liveconnect.SecurityContextHelper;

import javax.el.ELException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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

    public void setStatusByGoods(Long id, GoodsStatus status, Authentication authentication) {

        if (userService.isUserByModerator(authentication) || userService.isUserbyAdmin(authentication)) {
            Goods goods = goodsRepository.findOne(id);
            goods.setStatus(status);
            goodsRepository.save(goods);
        }
    }

    public void updateGoods(UpdateGoodsForm form) {
         Goods goods = goodsRepository.findOne(form.getId());
         form.update(goods);
         goodsRepository.save(goods);
    }

    public int getAllPriceInBasket(){
        Order order = getBasket();
        List<Goods>goods=order.getGoods();
        int sum=0;
        for (Goods good : goods) {
            sum = sum + Integer.parseInt(good.getPrice());
        }
        return sum;
    }

    public int getSumPriceInOrder(Long id){
        Order order = orderRepository.findOne(id);
        List<Goods>goods=order.getGoods();
        int sum=0;
        for (Goods good : goods) {
            sum = sum + Integer.parseInt(good.getPrice());
        }
        return sum;
    }



}