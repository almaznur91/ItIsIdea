package ru.itpark;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

    private static final String URL = "jdbc:postgresql://localhost:5432/zagir_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Zaq12wsx";

    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(URL);
        dataSource.setUsername(USER);
        dataSource.setPassword(PASSWORD);

        HumansDao humansDao = new HumansDaoJdbcTemplateImpl(dataSource);

        HumanService service = new HumanService(humansDao);

        Human human = Human.builder()
                .age(25)
                .citizen("Рашка")
                .name("Марсик")
                .build();


        humansDao.save(human);
        System.out.println(humansDao.find((long) 1));
        humansDao.delete((long)2);
        System.out.println(humansDao.findAll());


//    service.registerUser(human);

    }
}
