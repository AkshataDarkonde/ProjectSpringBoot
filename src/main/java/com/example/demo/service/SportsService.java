package com.example.demo.service;

import com.example.demo.Bean.Sports;
import com.example.demo.Repository.SportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SportsService {
    @Autowired
    SportsRepository sportsRepository;

    public List<Sports> getAllSports(){
        List<Sports> SportsList = new ArrayList<>();
        sportsRepository.findAll().forEach(x -> SportsList.add(x));
        return SportsList;
    }

    public Sports getSports(int noOfPlayers)
    {
        List<Sports> SportsList = new ArrayList<>();
        Sports sports=new Sports();
        sportsRepository.findById(noOfPlayers).get();
        return sportsRepository.findById(noOfPlayers).get();
    }

    public Sports addSports(Sports sports){
        Sports c1 = sportsRepository.save(sports);
        return c1;
    }

    public Sports updateSports(Sports sports){
        Sports c2= sportsRepository.save(sports);
        return c2;
    }

    public void deleteByNoOfPlayers(int noOfPlayers)
    {
        sportsRepository.deleteById(noOfPlayers);
    }
}
