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
    @Autowired
    FilesStorageService storageService;

    @Override
    public Long addGoods(AddGoodsForm form) {
        Goods goods = Goods.builder()
                .name(form.getName())
                .kcal(form.getPrice())
                .price(form.getPrice())
                .specification(form.getSpecification())
                .weight(form.getWeight())
                .status(form.getStatus())
                .image(storageService.saveGoodsPhoto(form.getPhoto()))
                .build();
        goodsRepository.save(goods);
        return goods.getId();
    }
}
