package itpark.java.app;

import itpark.java.config.JavaApplicationContext;
import itpark.java.model.Human;
import itpark.java.repository.HumansDao;
import itpark.java.repository.HumansDaoJdbcTemplateImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainJavaCompetationCompleate {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("itpark.xml.resources.resources\\context.xml");

                HumansDao humansDao = context.getBean(HumansDao.class);
        System.out.println(humansDao.findAll());
        Human human = Human.builder()
        .age(23)
        .citizen("Russia")
        .name("Almaz")
        .build();
        humansDao.save(human);



//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(JavaApplicationContext.class);
//        HumansDao humansDao = context.getBean(HumansDaoJdbcTemplateImpl.class);
//
//       humansDao.findAllByAge(1);
    }
}