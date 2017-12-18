package com.spring.radio.Domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "music")
public class Music implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_music")
    private int id_music;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "link")
    private String link;

    @Column(name = "id_radio")
    private int id_radio;

    public Music() {
    }

    public Music(String name, String author, String link,int id_radio) {
        this.name = name;
        this.author = author;
        this.link = link;
        this.id_radio= id_radio;
    }

    public int getId_music() {
        return id_music;
    }

    public void setId_music(int id_music) {
        this.id_music = id_music;
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

    public int getId_raido() {
        return id_radio;
    }

    public void setId_raido(int id_radio) {
        this.id_radio = id_radio;
    }
}
