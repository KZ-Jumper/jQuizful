package ua.com.jquizful.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ua.com.jquizful.model.User;
import ua.com.jquizful.repository.UserRepository;

/**
 * Created by Александр on 13.08.2015.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public User getUserById(long id) {
        return userRepository.getUserById(id);
    }

    @Override
    @Transactional
    public User getUserByName(String userName) {
        return userRepository.getUserByName(userName);
    }

    @Override
    @Transactional
    public boolean isUserNameRegistered(String userName) {
        return userRepository.isUserNameRegistered(userName);
    }

    @Override
    @Transactional
    public long saveUser(User user) {
        return userRepository.saveUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(User user) {
        userRepository.deleteUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        userRepository.deleteUser(id);
    }
}
