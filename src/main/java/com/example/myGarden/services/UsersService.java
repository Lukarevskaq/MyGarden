package com.example.myGarden.services;

import com.example.myGarden.interfaces.UserData;
import com.example.myGarden.models.Users;
import com.example.myGarden.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Long addUser(Users user) {
        usersRepository.save(user);
        return user.getId();
    }

    public UserData getUser(String name, String password) {
        return usersRepository.findOneByNameAndPassword(name, password);
    }

}