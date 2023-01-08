package com.example.myGarden.controllers;

import com.example.myGarden.interfaces.UserData;
import com.example.myGarden.models.Users;
import com.example.myGarden.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UsersController {
    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping("registration")
    public Long registerUser(@RequestBody Users user) {
        return usersService.addUser(user);
    }

    @GetMapping("login")
    public UserData getUser(@RequestParam String name, String password) {
        return usersService.getUser(name, password);
    }
}
