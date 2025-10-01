package ru.dao.achievementDao;

import ru.achievements.entities.Achievement;
import ru.achievements.entities.UsersAchievement;
import ru.dto.UsersAchievementDTO;

import java.util.List;

public interface AchievementDAO {
    public int create(Achievement achievement);
    public List<Achievement> getAll();
    public Integer existsByAction(String action);
    public boolean save(UsersAchievement usersAchievement);
}
