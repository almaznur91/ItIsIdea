package ru.almaz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.almaz.forms.AddGoodsForm;
import ru.almaz.models.Goods;
import ru.almaz.repositories.GoodsRepository;
@Component
public class AddGoodsServiceImpl implements AddGoodsService {

    @Autowired
    GoodsRepository goodsRepository;

    @Override
    public void addGoods(AddGoodsForm form) {
        Goods goods = Goods.builder()
                .name(form.getName())
                .kcal(form.getPrice())
                .price(form.getPrice())
                .weight(form.getWeight())
                .status(form.getStatus())
                .build();
        System.out.println("НУ как? ");
        goodsRepository.save(goods);
    }
}
