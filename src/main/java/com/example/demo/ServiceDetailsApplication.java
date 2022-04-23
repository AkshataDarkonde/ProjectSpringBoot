<<<<<<< HEAD
package com.example.demo;


import com.example.demo.Bean.Servicedetails;
import com.example.demo.Repository.ServiceDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.CommandLineRunner;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceDetailsApplication implements CommandLineRunner {
    @Autowired
    private ServiceDetailsRepository serviceRepository;

    public static void main(String[] args) {
        SpringApplication.run(PlayerApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        serviceRepository.save(new Servicedetails(1, 2, 7, 1000, 27));
        serviceRepository.save(new Servicedetails(2, 3, 6, 9500, 50));
        serviceRepository.save(new Servicedetails(3, 6, 8, 2000, 12));
        serviceRepository.save(new Servicedetails(4, 10,12, 5000, 9));


        System.out.println("\n findAll()");
        serviceRepository.findAll().forEach(p-> System.out.println(p));

        System.out.println("\nfindById(1L)");
        serviceRepository.findById(1).ifPresent(p-> System.out.println(p));

        System.out.println("\n findByTime('3')");
        serviceRepository.findByTime(2).forEach(p-> System.out.println(p));

    }

}
=======
package com.example.demo;


import com.example.demo.Bean.Servicedetails;
import com.example.demo.Repository.ServiceDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.CommandLineRunner;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceDetailsApplication implements CommandLineRunner {
    @Autowired
    private ServiceDetailsRepository serviceRepository;

    public static void main(String[] args) {
        SpringApplication.run(PlayerApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        serviceRepository.save(new Servicedetails(1, 2, 7, 1000, 27));
        serviceRepository.save(new Servicedetails(2, 3, 6, 9500, 50));
        serviceRepository.save(new Servicedetails(3, 6, 8, 2000, 12));
        serviceRepository.save(new Servicedetails(4, 10,12, 5000, 9));


        System.out.println("\n findAll()");
        serviceRepository.findAll().forEach(p-> System.out.println(p));

        System.out.println("\nfindById(1L)");
        serviceRepository.findById(1).ifPresent(p-> System.out.println(p));

        System.out.println("\n findByTime('3')");
        serviceRepository.findByTime(2).forEach(p-> System.out.println(p));

    }

}
>>>>>>> origin/master
