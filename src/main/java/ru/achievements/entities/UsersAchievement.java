package ru.achievements.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Table(name = "UsersAchievements")
@Entity
public class UsersAchievement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private int userId;

//    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "achievementId")
    private int achievementId;

    @Column(name = "date")
    private Date date;
}
