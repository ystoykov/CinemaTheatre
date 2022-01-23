package com.ystoik.spring.springboot.cinema.entity;

import javax.persistence.*;

@Entity
@Table(name = "hall")
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 64)
    private String name;

    @Column(name = "rows_num", nullable = false)
    private short rows_num;

    @Column(name = "seats_num", nullable = false)
    private short seats_num;

    @Column(name = "isOpen")
    private boolean isOpen;

    public Hall() {
    }

    public Hall(String name, short rows_num, short seats_num, boolean isOpen) {
        this.name = name;
        this.rows_num = rows_num;
        this.seats_num = seats_num;
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rows_num=" + rows_num +
                ", seats_num=" + seats_num +
                ", isOpen=" + isOpen +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getRows_num() {
        return rows_num;
    }

    public void setRows_num(short rows_num) {
        this.rows_num = rows_num;
    }

    public short getSeats_num() {
        return seats_num;
    }

    public void setSeats_num(short seats_num) {
        this.seats_num = seats_num;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
