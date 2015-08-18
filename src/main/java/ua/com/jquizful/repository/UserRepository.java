package ua.com.jquizful.repository;

import ua.com.jquizful.model.User;

/**
 * Created by Александр on 12.08.2015.
 */
public interface UserRepository {

    public User getUserById(long id);

    public User getUserByName(String userName);

    public boolean isUserNameRegistered(String userName);

    public long saveUser(User user);

    public void updateUser(User user);

    public void deleteUser(User user);

    public void deleteUser(long id);

}
