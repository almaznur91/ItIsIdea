package ru.almaz.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.almaz.repository.UserRepository;

public class Program {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ru.almaz\\context.xml");
        UserRepository usersRepository = context.getBean(UserRepository.class);
        System.out.println(usersRepository.findAll());
    }

}
