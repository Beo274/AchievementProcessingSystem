package ru.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.achievements.entities.Achievement;

@Repository
public interface AchievementRepository extends CrudRepository<Achievement, Integer> {
}
