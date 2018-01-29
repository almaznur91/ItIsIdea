package ru.almaz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.almaz.models.Goods;

public interface GoodsRepository extends JpaRepository<Goods,Long> {
}
