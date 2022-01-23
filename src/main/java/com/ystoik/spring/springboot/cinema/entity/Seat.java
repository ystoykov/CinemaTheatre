package com.ystoik.spring.springboot.cinema.entity;

import javax.persistence.*;

@Entity
@Table(name = "seat")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "row_number", nullable = false)
    private short rowNumber;

    @Column(name = "seat_number", nullable = false)
    private short seatNumber;

    @Column(name = "default_price", nullable = false)
    private float defaultPrice;

    @Column(name = "isLux", nullable = false)
    private boolean isLux;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "hall_id")
    private Hall seatsHall;

    public Seat() {
    }

    public Seat(short rowNumber, short seatNumber, float defaultPrice, boolean isLux) {
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        this.defaultPrice = defaultPrice;
        this.isLux = isLux;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public short getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(short row_number) {
        this.rowNumber = row_number;
    }

    public short getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(short seat_number) {
        this.seatNumber = seat_number;
    }

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float default_price) {
        this.defaultPrice = default_price;
    }

    public boolean isLux() {
        return isLux;
    }

    public void setLux(boolean lux) {
        isLux = lux;
    }

    public Hall getSeatsHall() {
        return seatsHall;
    }

    public void setSeatsHall(Hall seatsHall) {
        this.seatsHall = seatsHall;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", rowNumber=" + rowNumber +
                ", seatNumber=" + seatNumber +
                ", defaultPrice=" + defaultPrice +
                ", isLux=" + isLux +
                '}';
    }
}
