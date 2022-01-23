package com.ystoik.spring.springboot.cinema.entity;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "showsession_id", nullable = false)
    private Long showsession_id;

    @Column(name = "seat_id", nullable = false)
    private Long seat_id;

    @Column(name = "ticket_status")
    private String ticket_status;

    public Ticket() {
    }

    public Ticket(Long showsession_id, Long seat_id, String ticket_status) {
        this.showsession_id = showsession_id;
        this.seat_id = seat_id;
        this.ticket_status = ticket_status;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", showsession_id=" + showsession_id +
                ", seat_id=" + seat_id +
                ", ticket_status='" + ticket_status + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShowsession_id() {
        return showsession_id;
    }

    public void setShowsession_id(Long showsession_id) {
        this.showsession_id = showsession_id;
    }

    public Long getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(Long seat_id) {
        this.seat_id = seat_id;
    }

    public String getTicket_status() {
        return ticket_status;
    }

    public void setTicket_status(String ticket_status) {
        this.ticket_status = ticket_status;
    }
}
