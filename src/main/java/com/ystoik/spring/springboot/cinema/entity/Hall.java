package com.ystoik.spring.springboot.cinema.entity;

import javax.persistence.*;

@Entity
@Table(name = "halls")
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 64)
    private String name;

    @Column(name = "standart_row", nullable = false)
    private short standart_row;

    @Column(name = "standart_seats", nullable = false)
    private short standart_seats;

    @Column(name = "lux_row", nullable = false)
    private short lux_row;

    @Column(name = "lux_seats", nullable = false)
    private short lux_seats;

    @Column(name = "isOpen")
    private boolean isOpen;

    public Hall() {
    }

    public Hall(String name, short standart_row, short standart_seats, short lux_row, short lux_seats, boolean isOpen) {
        this.name = name;
        this.standart_row = standart_row;
        this.standart_seats = standart_seats;
        this.lux_row = lux_row;
        this.lux_seats = lux_seats;
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", standart_row=" + standart_row +
                ", standart_seats=" + standart_seats +
                ", lux_row=" + lux_row +
                ", lux_seats=" + lux_seats +
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

    public short getStandart_row() {
        return standart_row;
    }

    public void setStandart_row(short standart_row) {
        this.standart_row = standart_row;
    }

    public short getStandart_seats() {
        return standart_seats;
    }

    public void setStandart_seats(short standart_seats) {
        this.standart_seats = standart_seats;
    }

    public short getLux_row() {
        return lux_row;
    }

    public void setLux_row(short lux_row) {
        this.lux_row = lux_row;
    }

    public short getLux_seats() {
        return lux_seats;
    }

    public void setLux_seats(short lux_seats) {
        this.lux_seats = lux_seats;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
