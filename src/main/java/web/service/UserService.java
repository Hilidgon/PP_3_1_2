package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void add(User user);
    void delete(long id);
    void edit(long id, User user);
    User show(long id);
}
