package ru.achievements.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "game_achievements")
public class Achievement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JoinColumn(name = "id")
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private int id;

    @Column(name = "achievementName")
    private String achievementName;

    @Column(name = "action")
    private String action;

    @Column(name = "difficulty")
    private String difficulty;

    @Enumerated(EnumType.STRING)
    @Column(name = "platform")
    private Platform platform;
}
