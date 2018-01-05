package rut.almaz.models;

import lombok.*;

import javax.persistence.*;

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
    //private ArrayList<Order>orders;



}






