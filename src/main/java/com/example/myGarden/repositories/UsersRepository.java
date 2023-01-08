package com.example.myGarden.repositories;

import com.example.myGarden.interfaces.UserData;
import com.example.myGarden.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface UsersRepository extends JpaRepository<Users, Long> {
        UserData findOneByNameAndPassword(String name, String password);
}
