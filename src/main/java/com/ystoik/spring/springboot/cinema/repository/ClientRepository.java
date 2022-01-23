package com.ystoik.spring.springboot.cinema.repository;

import com.ystoik.spring.springboot.cinema.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findClientBySurname(String name);
}
