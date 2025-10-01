package ru.dao.achievementDao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.achievements.entities.Achievement;
import ru.achievements.entities.UsersAchievement;
import ru.dao.repository.AchievementRepository;
import ru.dao.repository.UserRepository;
import ru.dao.repository.UsersAchievementRepository;
import ru.dto.UsersAchievementDTO;

import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class AchievementDAOImpl implements AchievementDAO {
    @Autowired
    private AchievementRepository achievementRepository;

    @Autowired
    private UsersAchievementRepository usersAchievementRepository;

    @Override
    public int create(Achievement achievement) {
        achievementRepository.save(achievement);
        return achievement.getId();
    }

    @Override
    public List<Achievement> getAll() {
        return (List<Achievement>) achievementRepository.findAll();
    }

    @Override
    public Integer existsByAction(String action) {
        Achievement a  = achievementRepository.findByAction(action);
        log.info("achievement id for {} = {}", action, String.valueOf(a.getId()));
        return a.getId();
    }

    @Override
    public boolean save(UsersAchievement usersAchievement) {
        usersAchievementRepository.save(usersAchievement);
        return true;
    }
}

