package ru.almaz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import ru.almaz.models.Goods;
import ru.almaz.models.Order;
import ru.almaz.models.OrderStatus;
import ru.almaz.models.User;
import ru.almaz.repositories.GoodsRepository;
import ru.almaz.repositories.OrderRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl {

    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private GoodsService goodsService;


    public void addGoodToOrder(Long id) {

        Order order = goodsService.getBasket();
        Goods goods = goodsRepository.findOne(id);
        order.getGoods().add(goods);
        goods.getOrders().add(order);
        orderRepository.save(order);
        goodsRepository.save(goods);
    }


    public void setOrderStatusCheckout() {
        Order order = goodsService.getBasket();
        order.setOrderStatus(OrderStatus.PROCESSING);
        orderRepository.save(order);
    }

    public List<Order> getOrdersForOperator(){
        return (orderRepository.findAllByOrderStatusOrOrderStatusOrOrderStatus
                (OrderStatus.PROCESSING,OrderStatus.DELIVERY,OrderStatus.DELIVERED));
    }

    public List<Order> getOrderforUser(User user){
        return orderRepository.findAllByOrderStatusOrOrderStatusOrOrderStatusOrOrderStatusAndUser
                (OrderStatus.PROCESSING,OrderStatus.DELIVERY,OrderStatus.DELIVERED, OrderStatus.CLOSED,user);
    }


    public void changeOrderStatus(Order order){

        if (order.getOrderStatus()==OrderStatus.PROCESSING){
            order.setOrderStatus(OrderStatus.DELIVERY);
        }
        else if (order.getOrderStatus()==OrderStatus.DELIVERY){
            order.setOrderStatus(OrderStatus.DELIVERED);
        }
        else if (order.getOrderStatus()==OrderStatus.DELIVERED) {
            order.setOrderStatus(OrderStatus.CLOSED);
        }
        orderRepository.save(order);
    }


}