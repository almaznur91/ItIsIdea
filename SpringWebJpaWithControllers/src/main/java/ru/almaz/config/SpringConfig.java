package ru.almaz.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

    @Configuration
    @ComponentScan(basePackages = "ru.almaz")
    @EnableJpaRepositories(basePackages = "ru.almaz.repository")
    @EnableTransactionManagement
    @PropertySource(value = "classpath:ru.almaz\\application.properties")
    @EnableWebMvc
    public class SpringConfig extends WebMvcConfigurerAdapter {

    @Value("${hibernate.dialect}")
    private String hibernateDialect;

    @Value("${hibernate.hbm2ddl.auto}")
    private String hibernateDdlAuto;

    @Value("${hibernate.show_sql}")
    private String hibernateShowSql;

    @Value("${datasource.url}")
    private String dbUrl;

    @Value("${datasource.driver}")
    private String dbDriver;

    @Value("${datasource.user}")
    private String dbUser;

    @Value("${datasource.password}")
    private String dbPassword;

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(dbUrl);
        dataSource.setDriverClassName(dbDriver);
        dataSource.setUsername(dbUser);
        dataSource.setPassword(dbPassword);
        return dataSource;
    }


    @Bean
    @Scope(value = "prototype")
    public JdbcTemplate jdbcTemplate() {
       return new JdbcTemplate(dataSource());
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
       //создаем фабрику сущносей
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        //говорим какой дата сорс использовать
        em.setDataSource(dataSource());
        //говорим какие настройкм исполлзлывть
        em.setJpaProperties(hibernateProperties());
        //говорим где искать проанататоцмоннные модели
        em.setPackagesToScan(new String[]{"ru.almaz.models"});
        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        System.out.println("маркер=)");
        return em;
    }

    @Bean
    //бин для менеджера транзакций
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }


        //ViewResolver - интерфейс, который умеет находить необходимый view
        // по его названию. Имеются разные реализации, для jsp обычно
        // используется InternalResourceViewResolver.

    @Bean
        ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }


    public Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", hibernateDialect);
        properties.setProperty("hibernate.hbm2ddl.auto", hibernateDdlAuto);
        properties.setProperty("hibernate.show_sql", hibernateShowSql);

        return properties;
    }
}
