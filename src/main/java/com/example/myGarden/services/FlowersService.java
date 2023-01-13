package com.example.myGarden.services;

import com.example.myGarden.models.Flowers;
import com.example.myGarden.repositories.FlowersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowersService {

    private final FlowersRepository flowersRepository;

    @Autowired
    public FlowersService(FlowersRepository flowersRepository) {
        this.flowersRepository = flowersRepository;
    }

    public Long addFlower(String name, String description) {
        Flowers flower = new Flowers();
        flower.setName(name);
        flower.setDescription(description);
        flowersRepository.save(flower);
        return flower.getId();
    }

    public List<Flowers> getFlowersByUserId(Long userId) {
        return flowersRepository.findAllByUserId(userId);
    }

//    public List<Flowers> getFlowersByName(String title, Long userId) {
//    }

    public void updateFlower(Flowers flower) {
        Flowers flowerFromDB = flowersRepository.getReferenceById(flower.getId());
        flowerFromDB.setName(flower.getName());
        flowerFromDB.setDescription(flower.getDescription());
        flowersRepository.save(flowerFromDB);
    }

    public void deleteFlower(Long flowerId) {
        flowersRepository.deleteById(flowerId);
    }

    public Long addFlower(Flowers flower) {


        return null;
    }

}
