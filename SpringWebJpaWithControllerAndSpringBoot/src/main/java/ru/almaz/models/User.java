package ru.almaz.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
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
@Table(name = "users")



public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userLogin;
    private String userPassword;
    private String name;
    private String email;
    private LocalDateTime registrationDate;
    @Enumerated(EnumType.STRING)
    private State state;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String confirmString;






}






