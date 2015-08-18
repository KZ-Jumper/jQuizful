package ua.com.jquizful.repository;

import org.springframework.stereotype.Repository;
import ua.com.jquizful.model.User;

/**
 * Created by Александр on 12.08.2015.
 */
@Repository
public class UserRepositoryImpl extends BaseRepository implements UserRepository {

    @Override
    public User getUserById(long id) {
        return (User) getSession().get(User.class, id);
    }

    @Override
    public User getUserByName(String userName) {
        return (User) getSession()
                .createQuery("from User u where u.userName=:name")
                .setString("name", userName)
                .uniqueResult();
    }

    @Override
    public boolean isUserNameRegistered(String userName) {
        return getSession()
                .createQuery("select 1 from User u where u.userName=:name")
                .setString("name", userName)
                .list()
                .size() == 1;
    }

    @Override
    public long saveUser(User user) {
        return (Long) getSession()
                .save(user);
    }

    @Override
    public void updateUser(User user) {
        getSession().update(user);
    }

    @Override
    public void deleteUser(User user) {
        getSession().delete(user);
    }

    @Override
    public void deleteUser(long id) {
        getSession().createQuery("delete from User u where u.id=:id")
                .setLong("id", id)
                .executeUpdate();
    }
}
