package ru.service;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.achievements.entities.Achievement;
import ru.dao.AchievementDAO;

import java.util.List;

@Service
public class AchievementServiceImpl implements AchievementService {
    @Autowired
    AchievementDAO achievementDAO;

    @Override
    @Transactional
    public int createAchievement(Achievement achievement) {
        return achievementDAO.create(achievement);
    }

    public List<Achievement> getAllAchievements() {
        return achievementDAO.getAll();
    }
}
