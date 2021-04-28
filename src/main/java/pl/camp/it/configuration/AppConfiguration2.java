package pl.camp.it.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.camp.it.database.UserRepositoryDB;


@ComponentScan("pl.camp.it")
public class AppConfiguration2 {

    @Bean
    public UserRepositoryDB userRepositoryDB() {
        return new UserRepositoryDB();
    }
}
