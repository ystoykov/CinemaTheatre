package com.ystoik.spring.springboot.cinema.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "create_date", nullable = false)
    private Date create_date;

    @Column(name = "client_id", nullable = false)
    private Long client_id;

    @Column(name = "session_id", nullable = false)
    private Long session_id;

    @Column(name = "seat_id", nullable = false)
    private Long seat_id;

    @Column(name = "isReserve")
    private boolean isReserve;

    @Column(name = "isSold")
    private boolean isSold;

    @Column(name = "sold_date")
    private Date sold_date;

    @Column(name = "isReturn")
    private boolean isReturn;

    @Column(name = "return_date")
    private Date return_date;

    public Ticket() {
    }

    public Ticket(Date create_date, Long client_id, Long session_id, Long seat_id, boolean isReserve, boolean isSold, Date sold_date, boolean isReturn, Date return_date) {
        this.create_date = create_date;
        this.client_id = client_id;
        this.session_id = session_id;
        this.seat_id = seat_id;
        this.isReserve = isReserve;
        this.isSold = isSold;
        this.sold_date = sold_date;
        this.isReturn = isReturn;
        this.return_date = return_date;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", create_date=" + create_date +
                ", client_id=" + client_id +
                ", session_id=" + session_id +
                ", seat_id=" + seat_id +
                ", isReserve=" + isReserve +
                ", isSold=" + isSold +
                ", sold_date=" + sold_date +
                ", isReturn=" + isReturn +
                ", return_date=" + return_date +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public Long getSession_id() {
        return session_id;
    }

    public void setSession_id(Long session_id) {
        this.session_id = session_id;
    }

    public Long getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(Long seat_id) {
        this.seat_id = seat_id;
    }

    public boolean isReserve() {
        return isReserve;
    }

    public void setReserve(boolean reserve) {
        isReserve = reserve;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public Date getSold_date() {
        return sold_date;
    }

    public void setSold_date(Date sold_date) {
        this.sold_date = sold_date;
    }

    public boolean isReturn() {
        return isReturn;
    }

    public void setReturn(boolean aReturn) {
        isReturn = aReturn;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }
}
