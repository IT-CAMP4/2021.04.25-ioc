package pl.camp.it.database;

import org.springframework.stereotype.Component;
import pl.camp.it.model.User;
import java.util.List;

public class UserRepository implements IUserRepository {
    public boolean authenticate() {
        System.out.println("UserRepository authentication !!");
        return true;
    }

    public boolean register(String login, String pass) {
        System.out.println("UserRepository registration !!");
        return true;
    }

    public List<User> getUsers() {
        System.out.println("UserRepository getting users !!");
        return null;
    }
}
