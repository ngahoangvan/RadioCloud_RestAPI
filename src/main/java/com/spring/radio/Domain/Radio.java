package com.spring.radio.Domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "radio")
public class Radio implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_radio")
    private int id_radio;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "link")
    private String link;

    @Column(name = "details")
    private String details;

    @Column(name = "id_period")
    private int id_period;

    public Radio() {
    }

    public Radio(String name, String author, String link, String details, int id_period) {
        this.name = name;
        this.author = author;
        this.link = link;
        this.details = details;
        this.id_period = id_period;
    }

    public int getId_radio() {
        return id_radio;
    }

    public void setId_radio(int id_music) {
        this.id_radio = id_music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getId_period() {
        return id_period;
    }

    public void setId_period(int id_period) {
        this.id_period = id_period;
    }
}
