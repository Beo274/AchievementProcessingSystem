package ru.dao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.achievements.entities.Achievement;

import java.util.List;

@Repository
public interface AchievementRepository extends CrudRepository<Achievement, Integer> {
    public Achievement findByAction(String action);
}
