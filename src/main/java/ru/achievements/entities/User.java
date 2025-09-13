package ru.achievements.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "Users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column(unique = true, nullable = false)
    private String user_name;

    @Column
    private int rating;
}
