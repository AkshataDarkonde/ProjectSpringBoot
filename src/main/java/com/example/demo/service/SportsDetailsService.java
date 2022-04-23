package com.example.demo.service;

import com.example.demo.Bean.SportsDetails;
import com.example.demo.Repository.SportsDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SportsDetailsService {
    @Autowired
    SportsDetailsRepository sportsDetailsRepository;

    public List<SportsDetails> getAllSportsDetails(){
        List<SportsDetails> SportsDetailsList = new ArrayList<>();
        sportsDetailsRepository.findAll().forEach(x -> SportsDetailsList.add(x));
        return SportsDetailsList;
    }

    public SportsDetailsRepository getSportsDetails(int Sportsid)
    {
        List<SportsDetails> SportsDetailsList = new ArrayList<>();
        SportsDetails sportsDetails=new SportsDetails();
        sportsDetailsRepository.findById(Sportsid).get();
        return (SportsDetailsRepository) sportsDetailsRepository.findById(Sportsid).get();
    }

    public SportsDetails addSportsDetails(SportsDetails sportsDetails){
        SportsDetails sp1 = sportsDetailsRepository.save(sportsDetails);
        return sp1;
    }

    public SportsDetails updateSportsDetails(SportsDetails product){
        SportsDetails sp2= sportsDetailsRepository.save(product);
        return sp2;
    }

    public void deleteSportsDetails(int userid)
    {
        sportsDetailsRepository.deleteById(userid);
    }

}
