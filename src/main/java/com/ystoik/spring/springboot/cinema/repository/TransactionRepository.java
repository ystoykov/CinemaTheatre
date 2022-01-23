package com.ystoik.spring.springboot.cinema.repository;

import com.ystoik.spring.springboot.cinema.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}