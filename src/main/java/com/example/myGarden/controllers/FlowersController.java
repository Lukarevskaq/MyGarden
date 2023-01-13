package com.example.myGarden.controllers;

import com.example.myGarden.models.Flowers;
import com.example.myGarden.services.FlowersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flower")
public class FlowersController  {

    private final FlowersService flowersService;

    @Autowired
    public FlowersController(FlowersService flowersService) {
        this.flowersService = flowersService;
    }

    @PostMapping("/add")
    public Long addFlower(@RequestBody Flowers flower) {
        return flowersService.addFlower(flower);
    }
    @GetMapping("/getFlowers")
    public List<Flowers> getFlowersByUserId(@RequestParam Long userId) {
        return flowersService.getFlowersByUserId(userId);
    }

//    @GetMapping("getFlowersByName")
//    public List<Flowers> getFlowersByName(@RequestParam String title, Long userId) {
//        return flowersService.getFlowersByName(title, userId);
//    }

    @PutMapping("updateFlower")
    public void updateFlower(@RequestBody Flowers flower) {
        flowersService.updateFlower(flower);
    }

    @DeleteMapping("deleteFlower")
    public void deleteFlower(@RequestParam Long flowerId) {
        flowersService.deleteFlower(flowerId);
    }
}
