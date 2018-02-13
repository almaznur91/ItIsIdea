package ru.almaz.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import ru.almaz.models.Goods;


@AllArgsConstructor
@Data
@Builder
public class GoodsDto {

    String kcal;
    String name;
    String price;
    String weight;
    String imageUrl;


    public static GoodsDto from (Goods model){

        GoodsDto goodsDto =

                 GoodsDto.builder()
               .build();

        if(model.getName()!= null) {
            goodsDto.setName(model.getName());
        }
        if (model.getImage() != null) {
            goodsDto.imageUrl = "/files/" + model.getImage().getStorageFileName();
        }
        if (model.getPrice()!=null){
            goodsDto.price=model.getPrice();
        }
        if (model.getKcal()!=null){
            goodsDto.kcal=model.getKcal();        }

     return goodsDto;
    }
    }


