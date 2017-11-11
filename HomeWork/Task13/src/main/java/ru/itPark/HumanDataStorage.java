package ru.itPark;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class HumanDataStorage {
    JdbcTemplate template;
    HumanHowMapper humanHowMapper=new HumanHowMapper();


    public HumanDataStorage(DataSource dataSource) {
        template = new JdbcTemplate(dataSource);
    }

    public void setHuman(Human human) {
        template.update("INSERT INTO owner(age, name, nationality) VALUES (?, ?, ?)", human.getAge(), human.getName(), human.getNationality());

    }

    public Human getHuman(int id) {
        template.queryForObject("SELECT * FROM owner WHERE id = ?",humanHowMapper,1);
        return null;
    }

}
