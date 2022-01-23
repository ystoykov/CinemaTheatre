package com.ystoik.spring.springboot.cinema.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 64)
    private String firstName;

    @Column(name = "surname", nullable = false, length = 64)
    private String surname;

    @Column(name = "male", nullable = false, length = 8)
    private String male;

    @Column(name = "discount")
    private float discount;

    @OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
            CascadeType.REFRESH}, mappedBy = "transactionClient")
    private List<Transaction> transactions;

    public Client() {
    }

    public Client(String firstName, String surname, String male, float discount) {
        this.firstName = firstName;
        this.surname = surname;
        this.male = male;
        this.discount = discount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", male='" + male + '\'' +
                ", discount=" + discount +
                '}';
    }
}
