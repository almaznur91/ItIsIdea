package ru.almaz.forms;

import lombok.Data;
import ru.almaz.models.GoodsStatus;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class AddGoodsForm {
    private long id;
    private String name;
    private String price;
    private String kcal;
    private String weight;
    @Enumerated(EnumType.STRING)
    private GoodsStatus status;
}
