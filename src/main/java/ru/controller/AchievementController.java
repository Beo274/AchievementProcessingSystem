package ru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.achievements.entities.Achievement;
import ru.dto.AchievementDTO;
import ru.service.AchievementService;

import java.util.List;

@RestController
@RequestMapping("/achievement")
public class AchievementController {

    @Autowired
    AchievementService achievementService;

    @GetMapping
    public List<Achievement> getAchievements() {
        return achievementService.getAllAchievements();
    }

    @PostMapping("/add")
    public int createAchievement(@RequestBody AchievementDTO achievementDTO) {
        return achievementService.createAchievement(achievementDTO.toAchievement());
    }
}
