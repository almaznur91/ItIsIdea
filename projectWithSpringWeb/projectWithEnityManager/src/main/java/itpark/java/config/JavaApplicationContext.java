package itpark.java.config;


import itpark.java.repository.HumansDaoJdbcTemplateImpl;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "itpark")
@EnableTransactionManagement

public class JavaApplicationContext {


    @org.springframework.beans.factory.annotation.Value("${hibernate.dialect}")
    private String hibernateDialect;

    @org.springframework.beans.factory.annotation.Value("${hibernate.hbm2ddl.auto}")
    private String hibernateDdlAuto;

    @org.springframework.beans.factory.annotation.Value("${hibernate.show_sql}")
    private String hibernateShowSql;




    @Autowired
    @Qualifier(value = "driverManagerDataSource")
    private DataSource dataSource;

    @Bean
    @Scope(value = "prototype")
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource);
    }


    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setJpaProperties(hibernateProperties());
        em.setPackagesToScan(new String[]{"java.model"});
        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        return em;
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);
        return transactionManager;
    }

    public Properties hibernateProperties(){
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", hibernateDialect);
        properties.setProperty("hibernate.hbm2ddl.auto", hibernateDdlAuto);
        properties.setProperty("hibernate.show_sql",hibernateShowSql);
        return properties;
    }

}
