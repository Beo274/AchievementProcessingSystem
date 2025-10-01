package ru.service.achievementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.achievements.entities.Achievement;
import ru.dao.achievementDao.AchievementDAO;
import ru.dao.userDao.UserDAO;
import ru.dto.UsersAchievementDTO;

import java.util.List;

@Service
public class AchievementServiceImpl implements AchievementService {
    @Autowired
    AchievementDAO achievementDAO;

    @Autowired
    UserDAO userDAO;

    @Override
    @Transactional
    public int createAchievement(Achievement achievement) {
        return achievementDAO.create(achievement);
    }

    @Override
    @Transactional
    public List<Achievement> getAllAchievements() {
        return achievementDAO.getAll();
    }

    @Override
    @Transactional
    public boolean checkAchievement(UsersAchievementDTO usersAchievementDTO)
    {
        int achievementId = achievementDAO.existsByAction(usersAchievementDTO.getAction());
        int userId = userDAO.existsByName(usersAchievementDTO.getUsername());
        if (achievementId==-1 || userId==-1) {
            return false;
        } else {
            achievementDAO.save(usersAchievementDTO.toUsersAchievement(achievementId,userId));
            return true;
        }
    }
}
