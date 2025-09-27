package ru.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.achievements.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
