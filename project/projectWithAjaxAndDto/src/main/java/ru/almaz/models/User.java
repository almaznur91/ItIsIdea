package ru.almaz.models;

import lombok.*;
import org.aspectj.weaver.ast.Or;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "users")



public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userLogin;
    private String userPassword;
    private String name;
    private String email;
    private String address;
    private String telephone;
    private LocalDateTime registrationDate;
    @Enumerated(EnumType.STRING)
    private State state;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String confirmString;

    @OneToMany/*(mappedBy = "users", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)*/

    private Set<Order> orders = new HashSet<Order>();

    @OneToOne
    @JoinColumn(name = "image_id")
    private FileInfo image;





}






