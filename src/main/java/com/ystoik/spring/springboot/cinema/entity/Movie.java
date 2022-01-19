package com.ystoik.spring.springboot.cinema.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 128)
    private String name;

    @Column(name = "release_year", nullable = false)
    private short release_year;

    @Column(name = "duration", nullable = false)
    private Date duration;

    @Column(name = "premiere_date", nullable = false)
    private Date premiere_date;

    @Column(name = "final_date", nullable = false)
    private Date final_date;

    @Column(name = "description", nullable = false, length = 2048)
    private String description;

    @Column(name = "poster_addr", nullable = false, length = 1024)
    private String poster_addr;

    public Movie() {
    }

    public Movie(String name, short release_year, Date duration, Date premiere_date, Date final_date, String description, String poster_addr) {
        this.name = name;
        this.release_year = release_year;
        this.duration = duration;
        this.premiere_date = premiere_date;
        this.final_date = final_date;
        this.description = description;
        this.poster_addr = poster_addr;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", release_year=" + release_year +
                ", duration=" + duration +
                ", premiere_date=" + premiere_date +
                ", final_date=" + final_date +
                ", description='" + description + '\'' +
                ", poster_addr='" + poster_addr + '\'' +
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

    public short getRelease_year() {
        return release_year;
    }

    public void setRelease_year(short release_year) {
        this.release_year = release_year;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public Date getPremiere_date() {
        return premiere_date;
    }

    public void setPremiere_date(Date premiere_date) {
        this.premiere_date = premiere_date;
    }

    public Date getFinal_date() {
        return final_date;
    }

    public void setFinal_date(Date final_date) {
        this.final_date = final_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPoster_addr() {
        return poster_addr;
    }

    public void setPoster_addr(String poster_addr) {
        this.poster_addr = poster_addr;
    }
}
