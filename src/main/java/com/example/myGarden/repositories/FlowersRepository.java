package com.example.myGarden.repositories;

import com.example.myGarden.models.Flowers;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlowersRepository extends JpaRepository<Flowers, Long> {

  //  List<Flowers> findByTitleContainingIgnoreCaseAndUserId(String title, Long user_id);

    List<Flowers> findAllByUserId(Long userId);
}
