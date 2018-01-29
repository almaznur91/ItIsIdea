package ru.almaz.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    @ManyToMany
    @JoinTable(name = "orders_user",
                        joinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"),
                        inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))

    private List<User> owners;
}