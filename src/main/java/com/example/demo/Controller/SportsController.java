package com.example.demo.Controller;

import com.example.demo.Bean.Sports;
import com.example.demo.service.SportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SportsController {
    @Autowired
    SportsService sportsService;

    @GetMapping("/getAllSports")
    List<Sports> getAllSports()
    {
        System.out.println("From GetAllSports Method.");
        List<Sports> SportsList= sportsService.getAllSports();
        return SportsList;
    }

    @GetMapping("/getSports/{name}")
    Sports getSports(@PathVariable("SportsName") String SportsName)
    {
        System.out.println("From Get Sports Method.");
        return sportsService.getSports(SportsName);
    }

    @PostMapping("/addSports")
    Sports addSports(@RequestBody Sports sports)
    {
        System.out.println("From Add Sports Method.");
        return sportsService.addSports(sports);
    }

    @PutMapping("/updateSports")
    Sports updateSports(@RequestBody Sports sports)
    {
        System.out.println("From Update Sports Method.");
        return sportsService.updateSports(sports);
    }

    @DeleteMapping("/deleteSports/{SportsName}")
    void deleteSports(@PathVariable("SportsName") String SportsName)
    {
        System.out.println("From Delete Sports Method.");
        sportsService.deleteSports(SportsName);
    }
}
