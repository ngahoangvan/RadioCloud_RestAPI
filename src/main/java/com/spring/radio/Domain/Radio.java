package com.spring.radio.Domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "radio")
public class Radio  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_radio")
    private int id_radio;

    @Column(name = "name")
    private String name;

    @Column(name = "time")
    private Time time;

    @Column(name = "details")
    private String details;

    @Column(name = "picture")
    private String picture;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_radio", referencedColumnName = "id_radio")
    private List<Music> music;



    public Radio() {
    }

    public Radio(String name, Time time, String details, String picture) {
        this.name = name;
        this.time = time;
        this.details = details;
        this.picture = picture;
    }

    public int getId_radio() {
        return id_radio;
    }

    public void setId_radio(int id_radio) {
        this.id_radio = id_radio;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    public List<Music> getMusic() {
        return music;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

}
