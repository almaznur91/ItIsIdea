package ru.almaz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import ru.almaz.models.Goods;
import ru.almaz.models.Order;
import ru.almaz.models.OrderStatus;
import ru.almaz.models.User;
import ru.almaz.repositories.GoodsRepository;
import ru.almaz.repositories.OrderRepository;

import java.time.LocalDateTime;
@Service
public class OrderServiceImpl {

    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private GoodsService goodsService;


    public void addGoodToOrder(Long id){

            Order order =goodsService.getBasket();
            Goods goods = goodsRepository.findOne(id);
            order.getGoods().add(goods);
            goods.getOrders().add(order);
            orderRepository.save(order);
            goodsRepository.save(goods);
        }

    }


