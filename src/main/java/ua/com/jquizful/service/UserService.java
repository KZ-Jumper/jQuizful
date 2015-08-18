package ua.com.jquizful.service;

import ua.com.jquizful.model.User;

/**
 * Created by Александр on 13.08.2015.
 */
public interface UserService {

    public User getUserById(long id);

    public User getUserByName(String userName);

    public boolean isUserNameRegistered(String userName);

    public long saveUser(User user);

    public void updateUser(User user);

    public void deleteUser(User user);

    public void deleteUser(long id);

}
