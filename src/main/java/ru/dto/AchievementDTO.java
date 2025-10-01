package ru.dto;

import ru.achievements.entities.Achievement;
import ru.achievements.entities.Platform;

public class AchievementDTO {
    public String achievement_name;
    public String action;
    public String difficulty;
    public Platform platform;

    public static AchievementDTO from(Achievement achievement) {
        AchievementDTO dto = new AchievementDTO();
        dto.achievement_name = achievement.getAchievementName();
        dto.action = achievement.getAction();
        dto.difficulty = achievement.getDifficulty();
        dto.platform = achievement.getPlatform();
        return dto;
    }

    public Achievement toAchievement() {
        Achievement achievement = new Achievement();
        achievement.setAchievementName(this.achievement_name);
        achievement.setAction(this.action);
        achievement.setDifficulty(this.difficulty);
        achievement.setPlatform(this.platform);
        return achievement;
    }
}
