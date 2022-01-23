package com.ystoik.spring.springboot.cinema.repository;

import com.ystoik.spring.springboot.cinema.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
