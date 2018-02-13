package ru.almaz.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
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
    private LocalDateTime time;
    private int number;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @ManyToMany(mappedBy = "orders",fetch = FetchType.EAGER)
    private List<Goods> goods;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id"/*, nullable = false*/)
    private User user;

}