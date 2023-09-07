package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();
    void add(User user);
    void delete(long id);
    void edit(long id, User user);
    User show(long id);
}
