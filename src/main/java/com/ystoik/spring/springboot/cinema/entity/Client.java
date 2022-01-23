package com.ystoik.spring.springboot.cinema.entity;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 64)
    private String first_name;

    @Column(name = "surname", nullable = false, length = 64)
    private String surname;

    @Column(name = "male", nullable = false, length = 8)
    private String male;

    @Column(name = "discount")
    private float discount;

    public Client() {
    }

    public Client(String first_name, String surname, String male, float discount) {
        this.first_name = first_name;
        this.surname = surname;
        this.male = male;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", surname='" + surname + '\'' +
                ", male='" + male + '\'' +
                ", discount=" + discount +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
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
}
