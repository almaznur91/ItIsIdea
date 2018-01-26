package ru.itpark.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {



    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("ru.itpark.xml.resources.context.xml");
        HumansDao humansDao = context.getBean(HumansDaoJdbcTemplateImpl.class);
        humansDao.findAllByAge(1);

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
