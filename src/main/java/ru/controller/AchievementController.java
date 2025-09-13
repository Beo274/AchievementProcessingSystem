package ru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dto.AchievementDTO;
import ru.service.AchievementService;

@RestController
@RequestMapping("/achievement")
public class AchievementController {

    @Autowired
    AchievementService achievementService;

    @PostMapping("/add")
    public int createAchievement(@RequestBody AchievementDTO achievementDTO) {
        return achievementService.createAchievement(achievementDTO.toAchievement());
    }
}
