package ru.itPark;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HumanHowMapper implements RowMapper<Human> {

    public Human mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Human(resultSet.getString("name"), resultSet.getInt("age"), resultSet.getString("nationality"));
    }
}
