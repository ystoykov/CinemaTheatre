package com.ystoik.spring.springboot.cinema.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "show_session")
public class ShowSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "date", nullable = false)
    private Date date;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "movie_id")
    private Movie sessionMovie;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "hall_id")
    private Hall sessionHall;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "showSessionTicket", fetch = FetchType.EAGER)
    private List<Ticket> tickets;

    public ShowSession() {
    }

    public ShowSession(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Hall getSessionHall() {
        return sessionHall;
    }

    public void setSessionHall(Hall sessionHall) {
        this.sessionHall = sessionHall;
    }

    public Movie getSessionMovie() {
        return sessionMovie;
    }

    public void setSessionMovie(Movie sessionMovie) {
        this.sessionMovie = sessionMovie;
    }

    @Override
    public String toString() {
        return "ShowSession{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }
}
