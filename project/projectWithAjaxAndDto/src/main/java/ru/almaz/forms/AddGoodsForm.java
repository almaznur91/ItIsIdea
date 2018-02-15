package ru.almaz.forms;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
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
    private String specification;
    @Enumerated(EnumType.STRING)
    private GoodsStatus status;
    private MultipartFile photo;
}
