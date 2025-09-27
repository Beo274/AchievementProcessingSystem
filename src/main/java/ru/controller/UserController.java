package ru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.achievements.entities.User;
import ru.dto.UserDTO;
import ru.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create-user")
    public int addUser(@RequestBody UserDTO userDTO) {
        return userService.addUser(UserDTO.toUser(userDTO));
    }


}
