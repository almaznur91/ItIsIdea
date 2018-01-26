package ru.itpark.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJavaCompetationCompleate {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaAplicationContext.class);
        HumansDao humansDao = context.getBean(HumansDaoJdbcTemplateImpl.class);

//        humansDao.findAllByAge(1);
    }
}