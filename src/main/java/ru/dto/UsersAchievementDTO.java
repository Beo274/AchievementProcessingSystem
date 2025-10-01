package ru.dto;

import lombok.Data;
import ru.achievements.entities.UsersAchievement;

import java.util.Date;

@Data
public class UsersAchievementDTO {
    private String username;
    private String action;
    private String platform;

    public UsersAchievement toUsersAchievement(int achievementId, int userId) {
        UsersAchievement usersAchievement = new UsersAchievement();
        usersAchievement.setUserId(userId);
        usersAchievement.setAchievementId(achievementId);
        usersAchievement.setDate(new Date());
        return usersAchievement;
    }
}
