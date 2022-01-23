package com.ystoik.spring.springboot.cinema.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "client_id", nullable = false)
    private Long client_id;

    @Column(name = "ticket_id", nullable = false)
    private Long ticket_id;

    @Column(name = "transaction_time")
    private Date transaction_time;

    @Column(name = "transaction_type", nullable = false)
    private String transaction_type;

    @Column(name = "amount")
    private double amount;

    public Transaction() {
    }

    public Transaction(Long client_id, Long ticket_id, Date transaction_time, String transaction_type, double amount) {
        this.client_id = client_id;
        this.ticket_id = ticket_id;
        this.transaction_time = transaction_time;
        this.transaction_type = transaction_type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", client_id=" + client_id +
                ", ticket_id=" + ticket_id +
                ", transaction_time=" + transaction_time +
                ", transaction_type='" + transaction_type + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public Long getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Long ticket_id) {
        this.ticket_id = ticket_id;
    }

    public Date getTransaction_time() {
        return transaction_time;
    }

    public void setTransaction_time(Date transaction_time) {
        this.transaction_time = transaction_time;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
