package itpark.java.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "owner")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder

public class Human {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;


  private int age;
  private String name;
  private String citizen;
}
