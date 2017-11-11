package ru.itPark;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Zagriro", 26, "Tatar");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/zagir");
        dataSource.setUsername("postgres");
        dataSource.setPassword("Zaq12wsx");
        HumanDataStorage humanDataStorage = new HumanDataStorage(dataSource);
        humanDataStorage.setHuman(human);
        humanDataStorage.getHuman(1);
        System.out.println(human);


    }
}
