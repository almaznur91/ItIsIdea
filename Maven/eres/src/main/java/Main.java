import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.sql.ResultSet;

import javax.sql.DataSource;
import java.util.*;

public class Main {
    private static final String URL = "jdbc:postgresql://localhost:5432/zadr1.0";
    private static final String USER = "postgres";
    private static final String PASSWORD = "301991666";

    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(URL);
        dataSource.setUsername(USER);
        dataSource.setPassword(PASSWORD);

        Scanner scanner = new Scanner(System.in);
        JdbcTemplate template;
        template = new JdbcTemplate(dataSource);
        //while (true) {
        // template.update("INSERT INTO table1(name, numberofangles) VALUES (?,?)", scanner.next(), scanner.nextInt());
        // }
        //while (true) {
        // template.update("DELETE FROM table1 WHERE numberofangles=?", scanner.nextInt());
        //}

        //FigureRowMapper rowMapper = new FigureRowMapper();
        //language=SQL
       // List<Figure> figures = template.("SELECT *FROM table1");
       // System.out.println(figures);

        System.out.println(template.queryForList("SELECT *FROM table1"));
    }

    private static final String SQL_CREATE_TABLE = "CREATE TABLE table1  (id SERIAL PRIMARY KEY , name VARCHAR NOT NULL, numberOfAngles INT)";
    private static final String SQL_DELETE_TABLE = "DROP TABLE table1";
    private static final String SQL_INSERT = "INSERT INTO table1(name, numberofangles) VALUES ('',3)";
}