package ru.almaz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.almaz.models.Order;
import ru.almaz.models.OrderStatus;
import ru.almaz.models.User;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order,Long> {

    boolean existsOrderByUser_NameAndOrderStatus(String userName,OrderStatus status);
    Optional<Order> findByUser_UserLoginAndOrderStatus(String userLogin, OrderStatus status);
//    Optional<List<Order>> findAllByOrderStatusAndOrderStatusAndOrderStatus(OrderStatus status1,OrderStatus status2, OrderStatus status3);
    List<Order> findAllByOrderStatusOrOrderStatusOrOrderStatus(OrderStatus status1,OrderStatus status2, OrderStatus status3);
    List<Order> findAllByUser(User user);
}


