package pl.camp.it.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.camp.it.database.UserRepository;


@ComponentScan("pl.camp.it")
public class AppConfiguration {

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
}
