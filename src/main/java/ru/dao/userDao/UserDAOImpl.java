package ru.dao.userDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.achievements.entities.User;
import ru.dao.repository.UserRepository;

@Component
public class UserDAOImpl implements UserDAO {
    @Autowired
    UserRepository userRepository;

    @Override
    public int add(User user) {
        userRepository.save(user);
        return user.getUserId();
    }

    @Override
    public int existsByName(String username) {
        return userRepository.findByUsername(username).getUserId();
    }
}
