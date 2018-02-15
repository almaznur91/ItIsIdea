package ru.almaz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import ru.almaz.dto.OrderDto;
import ru.almaz.models.Goods;
import ru.almaz.models.Order;
import ru.almaz.models.OrderStatus;
import ru.almaz.models.User;
import ru.almaz.repositories.GoodsRepository;
import ru.almaz.repositories.OrderRepository;
import ru.almaz.repositories.UserRepository;
import ru.almaz.security.details.UserDetailsImpl;

import java.util.List;

@Service
public class OrderServiceImpl {

    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private GoodsService goodsService;
    @Autowired
    private UserRepository userRepository;


    public void addGoodToOrder(Long id) {

        Order order = goodsService.getBasket();
        Goods goods = goodsRepository.findOne(id);
        order.getGoods().add(goods);
        goods.getOrders().add(order);
        orderRepository.save(order);
        goodsRepository.save(goods);
    }


    public Order  getOrderStatusCheckout() {
        Order order = goodsService.getBasket();
        User user =order.getUser();
        order.setOrderStatus(OrderStatus.PROCESSING);
        orderRepository.save(order);
        userRepository.save(user);
        return order;

    }



    public List<Order> getOrdersForOperator(){
        return (orderRepository.findAllByOrderStatusOrOrderStatusOrOrderStatus
                (OrderStatus.PROCESSING,OrderStatus.DELIVERY,OrderStatus.DELIVERED));
    }

    public List<Order> getOrderforUser(Authentication authentication){
        User user = ((UserDetailsImpl)authentication.getPrincipal()).getUser();
        return orderRepository.findAllByUser(user);

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

    public int getSumOrdersByUser(Long id){
        User user = userRepository.findOne(id);
        return user.getOrders().size();


    }


    public void deleteGoodByBasket(Long id) {
        Order order = goodsService.getBasket();
        goodsRepository.findOne(id).getOrders().remove(order);
        orderRepository.save(order);
    }

    public OrderDto changeOrderStatusByController(Long id) {
        Order order = orderRepository.findOne(id);
        changeOrderStatus(order);
        return OrderDto.builder().id(String.valueOf(id)).orderStatus(order.getOrderStatus().toString()).build();
    }
}