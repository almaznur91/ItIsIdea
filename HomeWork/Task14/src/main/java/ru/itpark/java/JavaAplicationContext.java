package ru.itpark.java;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
//@ComponentScan(basePackages = "ru.itpark.java")
public class JavaAplicationContext {

    @Bean
    HumansDaoJdbcTemplateImpl humansDaoJdbcTemplate(DataSource dataSource){
        return new HumansDaoJdbcTemplateImpl();
    }



    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public DataSource dataSource() {
        String URL = "jdbc:postgresql://localhost:5432/Nurmukhametov_db";
        String USER = "postgres";
        String PASSWORD = "301991666";

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(URL);
        dataSource.setUsername(USER);
        dataSource.setPassword(PASSWORD);
        return dataSource;
    }
}
