package com.ystoik.spring.springboot.cinema.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 128)
    private String name;

    @Column(name = "release_year", nullable = false)
    private short releaseYear;

    @Column(name = "duration", nullable = false)
    private Date duration;

    @Column(name = "premiere_date", nullable = false)
    private Date premiereDate;

    @Column(name = "final_date", nullable = false)
    private Date finalDate;

    @Column(name = "description", nullable = false, length = 2048)
    private String description;

    @Column(name = "poster_addr", nullable = false, length = 1024)
    private String posterAddr;

    @OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
        CascadeType.REFRESH}, mappedBy = "sessionMovie", fetch = FetchType.EAGER)
    private List<ShowSession> showSessions;

    public Movie() {
    }

    public Movie(String name, short releaseYear, Date duration, Date premiereDate, Date finalDate, String description, String posterAddr) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.premiereDate = premiereDate;
        this.finalDate = finalDate;
        this.description = description;
        this.posterAddr = posterAddr;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", release_year=" + releaseYear +
                ", duration=" + duration +
                ", premiere_date=" + premiereDate +
                ", final_date=" + finalDate +
                ", description='" + description + '\'' +
                ", poster_addr='" + posterAddr + '\'' +
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

    public short getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(short release_year) {
        this.releaseYear = release_year;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public Date getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(Date premiere_date) {
        this.premiereDate = premiere_date;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date final_date) {
        this.finalDate = final_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPosterAddr() {
        return posterAddr;
    }

    public void setPosterAddr(String poster_addr) {
        this.posterAddr = poster_addr;
    }

    public List<ShowSession> getShowSessions() {
        return showSessions;
    }

    public void setShowSessions(List<ShowSession> showSessions) {
        this.showSessions = showSessions;
    }
}
