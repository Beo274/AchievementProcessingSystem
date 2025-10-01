package ru.dao.repository;

import org.springframework.data.repository.CrudRepository;
import ru.achievements.entities.UsersAchievement;

public interface UsersAchievementRepository extends CrudRepository<UsersAchievement, Integer> {
}
