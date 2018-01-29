package ru.almaz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)
@ComponentScan(basePackages = "ru.almaz")
@EntityScan(basePackages = "ru.almaz.models", basePackageClasses = Jsr310JpaConverters.class)
public class Main{
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

}


