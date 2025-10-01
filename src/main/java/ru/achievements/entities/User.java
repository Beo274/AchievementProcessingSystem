package ru.achievements.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "Users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "userId")
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private int userId;

    @Column(unique = true, nullable = false)
    private String username;

    @Column
    private int rating;
}
