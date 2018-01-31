package ru.almaz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.almaz.models.Goods;

import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods,Long> {
    @Query(value = "from Goods goods where goods.status = 'CONFIRMED'")
    List<Goods> findAllByConfimed();
}
