package ru.service.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.achievements.entities.User;
import ru.dao.userDao.UserDAO;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public int addUser(User user) { return userDAO.add(user); }
}
