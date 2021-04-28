package pl.camp.it.gui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.camp.it.database.IUserRepository;
import pl.camp.it.database.UserRepository;
import pl.camp.it.database.UserRepositoryDB;

@Component
public class GUI {

    @Autowired
    IUserRepository userRepository;

    public void login() {
        this.userRepository.authenticate();
    }

    public void register() {
        this.userRepository.register("sadfasd", "sadfasdf");
    }
}
