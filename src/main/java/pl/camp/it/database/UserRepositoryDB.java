package pl.camp.it.database;

import org.springframework.stereotype.Component;
import pl.camp.it.model.User;

import java.util.List;

public class UserRepositoryDB implements IUserRepository {
    public boolean authenticate() {
        System.out.println("UserRepositoryDB authentication !!");
        return true;
    }

    public boolean register(String login, String pass) {
        System.out.println("UserRepositoryDB registration !!");
        return true;
    }

    public List<User> getUsers() {
        System.out.println("UserRepositoryDB getting users !!");
        return null;
    }
}
