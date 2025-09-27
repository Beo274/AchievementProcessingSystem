package ru.dto;

import ru.achievements.entities.User;

public class UserDTO {
    private String user_name;

    public static UserDTO from(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.user_name = user.getUser_name();
        return userDTO;
    }

    public static User toUser(UserDTO userDTO) {
        User user = new User();
        user.setUser_name(userDTO.user_name);
        user.setRating(0);
        return user;
    }
}
