package ru.almaz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.almaz.models.Order;
import ru.almaz.models.OrderStatus;
import ru.almaz.models.User;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order,Long> {

    boolean existsOrderByUser_NameAndOrderStatus(String userName,OrderStatus status);
    Optional<Order> findByUser_UserLoginAndOrderStatus(String userLogin, OrderStatus status);
}
