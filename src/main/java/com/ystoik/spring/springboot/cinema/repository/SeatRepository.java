package com.ystoik.spring.springboot.cinema.repository;

import com.ystoik.spring.springboot.cinema.entity.Seat;
import org.springframework.data.repository.CrudRepository;

public interface SeatRepository extends CrudRepository<Seat, Long> {
}
