package ru.itpark;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

    private static final String URL = "jdbc:postgresql://localhost:5432/Nurmukhametov_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "301991666";

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
                .citizen("РФ")
                .name("Марик")
                .build();


        humansDao.save(human);
        humansDao.find((long)1);
        System.out.println(humansDao.findAll());

//    service.registerUser(human);

    }
}
