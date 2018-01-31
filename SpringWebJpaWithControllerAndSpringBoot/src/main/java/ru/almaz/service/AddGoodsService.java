package ru.almaz.service;

import ru.almaz.forms.AddGoodsForm;
import ru.almaz.models.Goods;

public interface AddGoodsService {
    void addGoods(AddGoodsForm form);
}
