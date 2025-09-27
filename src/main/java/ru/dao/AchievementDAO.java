package ru.dao;

import ru.achievements.entities.Achievement;

import java.util.List;

public interface AchievementDAO {
    public int create(Achievement achievement);
    public List<Achievement> getAll();
}
