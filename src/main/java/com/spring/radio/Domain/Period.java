package com.spring.radio.Domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "period")
public class Period implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_period")
    private int id_period;

    @Column(name = "name")
    private String name;

    @Column(name = "time")
    private Time time;


    @Column(name = "picture")
    private String picture;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_period", referencedColumnName = "id_period")
    private List<Radio> radio;



    public Period() {
    }

    public Period(String name, Time time, String picture) {
        this.name = name;
        this.time = time;
        this.picture = picture;
    }

    public int getId_period() {
        return id_period;
    }

    public void setId_period(int id_radio) {
        this.id_period = id_radio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    public List<Radio> getRadio() {
        return radio;
    }

    public void setRadio(List<Radio> radios) {
        this.radio = radios;
    }

}
