package ru.dao.userDao;

import ru.achievements.entities.User;
import ru.dto.UsersAchievementDTO;

public interface UserDAO {
    public int add(User user);
    public int existsByName(String username);
}
