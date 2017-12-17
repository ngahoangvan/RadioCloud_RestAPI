package com.spring.radio.Domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "profile")
public class Profile implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_profile")
    private int id_profile;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_birth")
    private String date_of_birth;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_profile", referencedColumnName = "id_member")
    private Member member;

    public Profile() {
    }

    public Profile(String name, String gender, String date_of_birth, String address, String email) {
        this.name = name;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.email = email;

    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public int getId_profile() {
        return id_profile;
    }

    public Profile setId_profile(int id_profile) {
        this.id_profile = id_profile;
        return this;
    }

    public String getName() {
        return name;
    }

    public Profile setName(String name) {
        this.name = name;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Profile setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public Profile setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Profile setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Profile setEmail(String email) {
        this.email = email;
        return this;
    }

}
