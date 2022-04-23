package com.example.demo;

import com.example.demo.Bean.SportsDetails;
import com.example.demo.Repository.SportsDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SportsDetailsApplication implements CommandLineRunner {
    @Autowired
    private SportsDetailsRepository sportsDetailsRepository;

    public static void main(String[] args) {
        SpringApplication.run(PlayerApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        sportsDetailsRepository.save(new SportsDetails(1, 1,"ON"));
        sportsDetailsRepository.save(new SportsDetails(2, 2, "ON"));
        sportsDetailsRepository.save(new SportsDetails(3,3,"ON"));
        sportsDetailsRepository.save(new SportsDetails(4, 4, "ON"));


        System.out.println("\n findall()");
        sportsDetailsRepository.findAll().forEach(p-> System.out.println(p));

        System.out.println("\nfindbyid(1L)");
        sportsDetailsRepository.findById(1).ifPresent(p-> System.out.println(p));

        System.out.println("\n findbystatus('ON')");
        sportsDetailsRepository.findByStatus("ON").forEach(p-> System.out.println(p));

    }

}
