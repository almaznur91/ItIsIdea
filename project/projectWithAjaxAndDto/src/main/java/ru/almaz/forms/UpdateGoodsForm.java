package ru.almaz.forms;


import lombok.Data;
import ru.almaz.models.Goods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

@Data
public class UpdateGoodsForm {
    String name;
    String kcal;
    String price;
    Long id;
    String specification;

    public void update(Goods model) {
        if (name.equals("")) {
            name = null;
        }
        model.setName(name);

        if (kcal.equals("")) {
            kcal = null;
        }

        model.setPrice(kcal);

        if (price.equals("")){
            price =null;
        }
        model.setPrice(price);

        if (specification.equals("")){
            specification =null;
        }
        model.setPrice(specification);
    }
}
