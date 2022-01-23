package com.ystoik.spring.springboot.cinema.entity;

import javax.persistence.*;

@Entity
@Table(name = "seat")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "hall_id", nullable = false)
    private long hall_id;

    @Column(name = "row_number", nullable = false)
    private short row_number;

    @Column(name = "seat_number", nullable = false)
    private short seat_number;

    @Column(name = "default_price", nullable = false)
    private float default_price;

    @Column(name = "isLux", nullable = false)
    private boolean isLux;

    public Seat() {
    }

    public Seat(long hall_id, short row_number, short seat_number, float default_price, boolean isLux) {
        this.hall_id = hall_id;
        this.row_number = row_number;
        this.seat_number = seat_number;
        this.default_price = default_price;
        this.isLux = isLux;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", hall_id=" + hall_id +
                ", row_number=" + row_number +
                ", seat_number=" + seat_number +
                ", default_price=" + default_price +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getHall_id() {
        return hall_id;
    }

    public void setHall_id(long hall_id) {
        this.hall_id = hall_id;
    }

    public short getRow_number() {
        return row_number;
    }

    public void setRow_number(short row_number) {
        this.row_number = row_number;
    }

    public short getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(short seat_number) {
        this.seat_number = seat_number;
    }

    public float getDefault_price() {
        return default_price;
    }

    public void setDefault_price(float default_price) {
        this.default_price = default_price;
    }

    public boolean isLux() {
        return isLux;
    }

    public void setLux(boolean lux) {
        isLux = lux;
    }
}
