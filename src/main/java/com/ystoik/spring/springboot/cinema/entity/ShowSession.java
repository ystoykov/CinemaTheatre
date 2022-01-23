package com.ystoik.spring.springboot.cinema.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "show_session")
public class ShowSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "movie_id", nullable = false)
    private Long movie_id;

    @Column(name = "hall_id", nullable = false)
    private Long hall_id;

    @Column(name = "date", nullable = false)
    private Date date;

    public ShowSession() {
    }

    public ShowSession(Long movie_id, Long hall_id, Date date) {
        this.movie_id = movie_id;
        this.hall_id = hall_id;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Session{" +
                "id=" + id +
                ", movie_id=" + movie_id +
                ", hall_id=" + hall_id +
                ", date=" + date +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Long movie_id) {
        this.movie_id = movie_id;
    }

    public Long getHall_id() {
        return hall_id;
    }

    public void setHall_id(Long hall_id) {
        this.hall_id = hall_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
