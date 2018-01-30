package ru.almaz.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table (name = "goods")

public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String price;
    private String kcal;
    private String weight;
    @Enumerated(EnumType.STRING)
    private GoodsStatus status;
    @ManyToMany
    @JoinTable(name = "orders_goods",
            joinColumns = @JoinColumn(name = "goods_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"))
    private List<Order> orders;

}
