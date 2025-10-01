package ru.service.achievementService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.accessStrategies.Context;
import ru.accessStrategies.Strategy;
import ru.accessStrategies.strategies.PlaystationStrategy;
import ru.accessStrategies.strategies.SteamStrategy;
import ru.accessStrategies.strategies.XboxStrategy;
import ru.achievements.entities.Achievement;
import ru.dao.achievementDao.AchievementDAO;
import ru.dao.userDao.UserDAO;
import ru.dto.UsersAchievementDTO;

import java.util.List;

@Service
@Slf4j
public class AchievementServiceImpl implements AchievementService {
    @Autowired
    AchievementDAO achievementDAO;

    @Autowired
    UserDAO userDAO;

    @Autowired
    Context context;

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
            Strategy strategy;
            switch (usersAchievementDTO.getPlatform()) {
                case "Steam":
                    strategy = new SteamStrategy();
                    break;
                case "Playstation":
                    strategy = new PlaystationStrategy();
                    break;
                case "Xbox":
                    strategy = new XboxStrategy();
                    break;
                default:
                    log.info("NO PLATFORM");
                    return false;
            }
            context.setStrategy(strategy);
            context.doSomething();
            achievementDAO.save(usersAchievementDTO.toUsersAchievement(achievementId,userId));
            return true;
        }
    }
}
