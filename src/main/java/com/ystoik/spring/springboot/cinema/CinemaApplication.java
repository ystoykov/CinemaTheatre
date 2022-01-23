package com.ystoik.spring.springboot.cinema;

import com.ystoik.spring.springboot.cinema.entity.Client;
import com.ystoik.spring.springboot.cinema.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class CinemaApplication implements CommandLineRunner {

    @Autowired
    private ClientRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(CinemaApplication.class, args);
    }

    @Override
    public void run(String... args) {

        repository.save(new Client("Jacob", "Joikov", "male", 0));
        repository.save(new Client("Bacob", "Toikov", "male", 0));
        repository.save(new Client("Sacob", "Stoikov", "male", 0));

        System.out.println("\nfindByName('Stoikov')");
        repository.findClientBySurname("Stoikov").forEach(x -> System.out.println(x));
    }
}
