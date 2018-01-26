package ru.itpark.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;





public class HumansDaoJdbcTemplateImpl implements HumansDao {

    //language=SQL
    private static final String SQL_SELECT_BY_NAME =
            "SELECT * FROM owner WHERE name = ?";

    //language=SQL
    private static final String SQL_INSERT_USER =
            "INSERT INTO owner(age, name, citizen) VALUES (?, ?, ?)";
    //language=SQL
    public static final String SQL_FIND_BY_ID = "SELECT * FROM owner WHERE id=?";

    private static final String SQL_UPDATE_USER =
            "UPDATE  owner SET age=?,name = ?, citizen = ? WHERE id = ?";

    //language=SQL
    public static final String SQL_DELETE_BY_ID = "DELETE FROM owner WHERE id = ?";
    //language=SQL

    public static final String SQL_SELECT_ALL = "SELECT *FROM owner ";

    @Autowired
    private JdbcTemplate template;

    private RowMapper<Human> rowMapper = (resultSet, rowNum) -> {
        Human result = Human.builder()
                .id(resultSet.getLong("id"))
                .age(resultSet.getInt("age"))
                .name(resultSet.getString("name"))
                .citizen(resultSet.getString("citizen"))
                .build();

        return result;
    };

    public List<Human> findAllByAge(int age) {
        return null;
    }

    public Human findOneByName(String name) {
        List<Human> result = template.query(SQL_SELECT_BY_NAME, rowMapper, name);
        if (result.size() > 0) {
            return result.get(0);
        }
        return null;
    }


    public void save(Human model) {
        template.update(SQL_INSERT_USER, model.getAge(), model.getName(), model.getCitizen());
    }

    public Human find(Long id) {
        List<Human> result = template.query(SQL_FIND_BY_ID, rowMapper, id);
        if (result.size() > 0) {
            return result.get(0);
        }
        return null;
    }

    public void update(Human model) {
        template.update(SQL_UPDATE_USER, model.getAge(), model.getName(), model.getCitizen(), model.getId());
    }

    public void delete(Long id) {
        template.update(SQL_DELETE_BY_ID, id);
    }

    public List<Human> findAll() {
        return template.query(SQL_SELECT_ALL, rowMapper);

    }

}
