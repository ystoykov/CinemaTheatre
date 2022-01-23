package com.ystoik.spring.springboot.cinema.entity;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "ticket_status")
    private String ticketStatus;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "showsession_id")
    private ShowSession showSessionTicket;

    @OneToOne()
    @JoinColumn(name = "seat_id")
    private Seat ticketSeat;

    public Ticket() {
    }

    public Ticket(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticket_status) {
        this.ticketStatus = ticket_status;
    }

    public ShowSession getShowSessionTicket() {
        return showSessionTicket;
    }

    public void setShowSessionTicket(ShowSession showSessionTicket) {
        this.showSessionTicket = showSessionTicket;
    }

    public Seat getTicketSeat() {
        return ticketSeat;
    }

    public void setTicketSeat(Seat ticketSeat) {
        this.ticketSeat = ticketSeat;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", ticketStatus='" + ticketStatus + '\'' +
                '}';
    }
}
