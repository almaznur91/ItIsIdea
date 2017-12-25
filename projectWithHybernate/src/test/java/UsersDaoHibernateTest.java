import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class UsersDaoHibernateTest {

    UserDaoHibernate usersDao;
    private JdbcTemplate template;


    @Before

    public void setUp() {
        EmbeddedDatabase database = new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.HSQL)
                .addScript("schema.sql")
                .addScript("data.sql")
                .build();
        template = new JdbcTemplate(database);

        Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.url", "jdbc:hsqldb:mem:test");
        configuration.addAnnotatedClass(User.class);
        SessionFactory factory = configuration.buildSessionFactory();
        usersDao = new UserDaoHibernate(factory);

    }



    private RowMapper<User> rowMapper = new RowMapper<User>() {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            return User.builder()
                    .id(rs.getLong("id"))
                    .userLogin(rs.getString("userLogin"))
                    .userPassword(rs.getString("userPassword"))
                    .name(rs.getString("name"))
                    .email(rs.getString("email"))
                    .build();

        }
    };

    @Test
    public void save() {
        User expected = User.builder()
                .userLogin("zagr91")
                .userPassword("191991666")
                .email("zagirnur@gmail.com")
                .name("Zagir")
                .build();
        usersDao.save(expected);
        User actual = template.queryForObject("SELECT * FROM users WHERE id = 1 " ,rowMapper);
        Assert.assertEquals(actual, expected);



    }


    @Test
    public void find() {
        User actual = usersDao.find(1L);
        User expected = User.builder()
                .id(1L)
                .userLogin("almazic91")
                .userPassword("301991666")
                .email("almazic91@gmail.com")
                .name("Almaz")
                .build();

        Assert.assertEquals(actual, expected);

    }
    @After

    public void dropTable(){
        template.update("DROP TABLE users");
    }

    //    @Test
//    public void update() {
//    }
//
//    @Test
//    public void delete() {
//
//        User actual = usersDao.delete(1L);
//
//    }
//
//    @Test
//    public void findAll() {
//    }
}