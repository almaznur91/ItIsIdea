package ru.almaz.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table (name = "orders")

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date name;
    private int number;
   // @ManyToMany(mappedBy = "orders")
    //private ArrayList <Good> goods;
}