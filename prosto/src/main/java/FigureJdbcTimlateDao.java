import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;


public class FigureJdbcTimlateDao implements FureDao {
    //language=SQL
    private static final String SQL_CREATE_TABLE = "CREATE TABLE `table1` (CREATE table1 (id INT(10)AUTO_INCREMENT, name VARCHAR(10) NOT NULL, numberOfAngles INT(10) ));";
    //language=SQL

    private static final String SQL_SELECT_ALL = "SELECT*FROM table1";
    //language=SQL
    private static final String SQL_INSERT_FIGURE = "INSERT INTO table1(name,numberOfAngles) VALUES (?,?)";

    private JdbcTemplate template;

    private RowMapper<Figure> rowMapper = (resultSet, rowNum) -> {
        Figure result = Figure.builder()
                .id(resultSet.getLong("id"))
                .name(resultSet.getString("name"))
                .numberOfAngles(resultSet.getInt("numberOfAngles"))
                .build();

        return result;
    };

    public FigureJdbcTimlateDao(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(Figure model) {
        template.update(SQL_INSERT_FIGURE, model.getName(), model.getNumberOfAngles());
    }

    @Override
    public Figure find(Long id) {
        return null;
    }

    @Override
    public void update(Figure model) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Figure> findAll() {
        return template.query(SQL_SELECT_ALL, rowMapper);
    }

    public void creatTable() {
        template.update(SQL_CREATE_TABLE);
    }
}
