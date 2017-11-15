import lombok.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder

public class Figure {
    private Long id;
    private String name;
    private int numberOfAngles;


}
