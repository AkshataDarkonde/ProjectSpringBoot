package com.example.demo;

import com.example.demo.Bean.Player;
import com.example.demo.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayerApplication implements CommandLineRunner {
	@Autowired
	private PlayerRepository playerRepository;

	public static void main(String[] args) {
		SpringApplication.run(PlayerApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		playerRepository.save(new Player(1,"Akshata","Darkonde","Football",887097764));
		playerRepository.save(new Player(2,"Sriram","Palivela","Golf",986353728));
		playerRepository.save(new Player(3,"Keshav","Sharma","Hokey",990756545));
		playerRepository.save(new Player(4,"Ankit","Wadikhaye","Cricket",845312233));


		System.out.println("\n findall()");
		playerRepository.findAll().forEach(p-> System.out.println(p));

		System.out.println("\nfindbyid(1L)");
		playerRepository.findById(1).ifPresent(p-> System.out.println(p));

		System.out.println("\n findbyname('Akshata')");
		playerRepository.findByName("Akshata").forEach(p-> System.out.println(p));

	}

}
