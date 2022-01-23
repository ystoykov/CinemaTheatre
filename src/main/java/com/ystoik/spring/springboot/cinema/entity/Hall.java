package com.ystoik.spring.springboot.cinema.entity;

import javax.persistence.*;
import java.util.List;

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
    private short rowsNum;

    @Column(name = "seats_num", nullable = false)
    private short seatsNum;

    @Column(name = "isOpen")
    private boolean isOpen;

    @OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
            CascadeType.REFRESH}, mappedBy = "seatsHall", fetch = FetchType.EAGER)
    private List<Seat> seats;

    public Hall() {
    }

    public Hall(String name, short rowsNum, short seatsNum, boolean isOpen) {
        this.name = name;
        this.rowsNum = rowsNum;
        this.seatsNum = seatsNum;
        this.isOpen = isOpen;
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

    public short getRowsNum() {
        return rowsNum;
    }

    public void setRowsNum(short rows_num) {
        this.rowsNum = rows_num;
    }

    public short getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(short seats_num) {
        this.seatsNum = seats_num;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rowsNum=" + rowsNum +
                ", seatsNum=" + seatsNum +
                ", isOpen=" + isOpen +
                '}';
    }
}
