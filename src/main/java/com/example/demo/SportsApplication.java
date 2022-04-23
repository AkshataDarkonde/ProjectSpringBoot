<<<<<<< HEAD
package com.example.demo;

import com.example.demo.Bean.Sports;
import com.example.demo.Repository.SportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.CommandLineRunner;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SportsApplication implements CommandLineRunner {
    @Autowired
    private SportsRepository sportsRepository;

    public static void main(String[] args) {
        SpringApplication.run(PlayerApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        sportsRepository.save(new Sports("Cricket", 4, 27));
        sportsRepository.save(new Sports("Hokey",2, 10));
        sportsRepository.save(new Sports("Golf",5,9));
        sportsRepository.save(new Sports("Football",7, 10));


        System.out.println("\n findall()");
        sportsRepository.findAll().forEach(p-> System.out.println(p));

        System.out.println("\nfindbyTime(1L)");
        sportsRepository.findById(4).ifPresent(p-> System.out.println(p));

        System.out.println("\n findbyNoOfPlayers('Cricket')");
        sportsRepository.findByNoOfPlayers(27).forEach(p-> System.out.println(p));

    }

}
=======
package com.example.demo;

import com.example.demo.Bean.Sports;
import com.example.demo.Repository.SportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.CommandLineRunner;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SportsApplication implements CommandLineRunner {
    @Autowired
    private SportsRepository sportsRepository;

    public static void main(String[] args) {
        SpringApplication.run(PlayerApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        sportsRepository.save(new Sports("Cricket", 4, 27));
        sportsRepository.save(new Sports("Hokey",2, 10));
        sportsRepository.save(new Sports("Golf",5,9));
        sportsRepository.save(new Sports("Football",7, 10));


        System.out.println("\n findall()");
        sportsRepository.findAll().forEach(p-> System.out.println(p));

        System.out.println("\nfindbyid(1L)");
        sportsRepository.findById(2).ifPresent(p-> System.out.println(p));

        System.out.println("\n findbyName(4)");
        sportsRepository.findByName("Cricket").forEach(p-> System.out.println(p));

    }

}
>>>>>>> origin/master
