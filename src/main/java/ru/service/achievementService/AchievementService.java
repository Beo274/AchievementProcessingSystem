package ru.service.achievementService;

import ru.achievements.entities.Achievement;
import ru.dto.UsersAchievementDTO;

import java.util.List;

public interface AchievementService {
    public int createAchievement(Achievement achievement);
    public List<Achievement> getAllAchievements();
    public boolean checkAchievement(UsersAchievementDTO usersAchievementDTO);
}
