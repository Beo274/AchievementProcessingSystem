package ru.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.achievements.entities.Achievement;
import ru.repository.AchievementRepository;

@Component
public class AchievementDAOImpl implements AchievementDAO {
    @Autowired
    private AchievementRepository achievementRepository;

    @Override
    public int create(Achievement achievement) {
        achievementRepository.save(achievement);
        return achievement.getId();
    }
}
