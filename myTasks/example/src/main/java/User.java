import lombok.*;

import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class User {
    private Long id;
    private int age;
    private String name;
    private String citizen;
    private Set<Car> cars;


}
