import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

    private static final String URL = "jdbc:postgresql://localhost:5432/zadr1.0";
    private static final String USER = "postgres";
    private static final String PASSWORD = "301991666";

    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(URL);
        dataSource.setUsername(USER);
        dataSource.setPassword(PASSWORD);

        FureDao humansDao = new FigureJdbcTimlateDao(dataSource);

       // HumanService service = new HumanService(humansDao);
Figure figure = Figure.builder()
        .name("ThreeANGLE")
        .numberOfAngles(3)
        .build();

        humansDao.creattable
        System.out.println(humansDao.findAll());

//    service.registerUser(human);

    }
}
