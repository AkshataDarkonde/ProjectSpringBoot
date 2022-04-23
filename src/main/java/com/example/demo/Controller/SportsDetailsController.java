package com.example.demo.Controller;

import com.example.demo.Bean.SportsDetails;
import com.example.demo.service.SportsDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SportsDetailsController {
    @Autowired
    SportsDetailsService sportsDetailsService;

    @GetMapping("/getAllSportsDetails")
    List<SportsDetails> getAllSportsDetails()
    {
        System.out.println("From GetallSportsDetails Method.");
        List<SportsDetails> SportsDetailsList= sportsDetailsService.getAllSportsDetails();
        return SportsDetailsList;
    }

    @GetMapping("/getSportsDetails/{id}")
    SportsDetails getSportsDetails(@PathVariable("id") int id)
    {
        System.out.println("From Get Sportsdetails Method.");

        return (SportsDetails) sportsDetailsService.getSportsDetails(id);
    }

    @PostMapping("/addSportsDetails")
    SportsDetails addSportsDetails(@RequestBody SportsDetails sportsDetails)
    {
        System.out.println("From Add SportsDetails Method.");
        return sportsDetailsService.addSportsDetails(sportsDetails);
    }

    @PutMapping("/updateSportsDetails")
    SportsDetails updateSportsDetails(@RequestBody SportsDetails sportsDetails)
    {
        System.out.println("From Update SportsDetails Method.");
        return sportsDetailsService.updateSportsDetails(sportsDetails);
    }

    @DeleteMapping("/deleteSportsDetails/{Sportsid}")
    void deleteSportsDetails(@PathVariable("Sportsid") int Sportsid)
    {
        System.out.println("From Delete SportsDetails Method.");
        sportsDetailsService.deleteSportsDetails(Sportsid);
    }
}
