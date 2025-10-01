package ru.dto;

import lombok.Setter;
import ru.achievements.entities.User;

@Setter
public class UserDTO {
    private String user_name;

    public static UserDTO from(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.user_name = user.getUsername();
        return userDTO;
    }

    public static User toUser(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.user_name);
        user.setRating(0);
        return user;
    }
}
