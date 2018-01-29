package ru.almaz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.almaz.models.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {


}
