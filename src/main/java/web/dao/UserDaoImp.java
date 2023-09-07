package web.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import web.models.User;


import java.util.List;


@Repository
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> allUsers() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(long id) {
        entityManager.remove(entityManager.find(User.class, id));
    }

    @Override
    public void edit(long id, User newUser) {
        User user = entityManager.find(User.class, id);
        user.setName(newUser.getName());
        user.setAge(newUser.getAge());
        entityManager.persist(user);
    }

    @Override
    public User show(long id) {
        return entityManager.find(User.class, id);
    }
}
