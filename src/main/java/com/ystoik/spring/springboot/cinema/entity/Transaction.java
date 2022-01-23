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

    @Column(name = "transaction_time")
    private Date transactionTime;

    @Column(name = "transaction_type", nullable = false)
    private String transactionType;

    @Column(name = "amount")
    private double amount;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "client_id")
    private Client transactionClient;

    @OneToOne()
    @JoinColumn(name = "ticket_id")
    private Ticket transactionTicket;

    public Transaction() {
    }

    public Transaction(Date transactionTime, String transactionType, double amount) {
        this.transactionTime = transactionTime;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Date transaction_time) {
        this.transactionTime = transaction_time;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transaction_type) {
        this.transactionType = transaction_type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", transactionTime=" + transactionTime +
                ", transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                '}';
    }
}
