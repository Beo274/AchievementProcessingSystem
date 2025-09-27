package ru.service;

import ru.achievements.entities.Achievement;

import java.util.List;

public interface AchievementService {
    public int createAchievement(Achievement achievement);
    public List<Achievement> getAllAchievements();
}
