package ru.almaz.service;

import org.springframework.security.access.annotation.Secured;
import ru.almaz.forms.AddGoodsForm;
import ru.almaz.models.Goods;

public interface AddGoodsService {

    void addGoods(AddGoodsForm form);
}
