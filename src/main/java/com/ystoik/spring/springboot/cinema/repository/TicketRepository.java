package com.ystoik.spring.springboot.cinema.repository;

import com.ystoik.spring.springboot.cinema.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
