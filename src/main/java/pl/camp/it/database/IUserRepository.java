package pl.camp.it.database;

import pl.camp.it.model.User;

import java.util.List;

public interface IUserRepository {
    boolean authenticate();
    boolean register(String login, String pass);
    List<User> getUsers();


}
