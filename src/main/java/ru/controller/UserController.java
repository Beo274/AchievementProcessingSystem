package ru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.dto.UserDTO;
import ru.service.userService.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create-user")
    public int addUser(@RequestBody UserDTO userDTO) {
        return userService.addUser(UserDTO.toUser(userDTO));
    }


}
