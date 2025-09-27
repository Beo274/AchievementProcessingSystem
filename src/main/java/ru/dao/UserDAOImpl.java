package ru.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.achievements.entities.User;
import ru.repository.UserRepository;

@Component
public class UserDAOImpl implements UserDAO {
    @Autowired
    UserRepository userRepository;

    @Override
    public int add(User user) {
        userRepository.save(user);
        return user.getUser_id();
    }
}
