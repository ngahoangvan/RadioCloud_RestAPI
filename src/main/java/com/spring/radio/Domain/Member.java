package com.spring.radio.Domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "member")
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_member")
    private int id_member;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

<<<<<<< HEAD
    @Column(name = "role")
    private String role;

    @Column(name = "enable")
    private boolean enable;

    public Member(String username, String password, String role, boolean enable) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.enable = enable;
    }

    public Member(String username, String password) {
=======
    public Member() {
    }

    public Member(int id_member, String username, String password) {
        this.id_member = id_member;
>>>>>>> Backend
        this.username = username;
        this.password = password;
    }

<<<<<<< HEAD
    public Member() {
    }

=======
>>>>>>> Backend
    public int getId_member() {
        return id_member;
    }

    public void setId_member(int id_member) {
        this.id_member = id_member;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

<<<<<<< HEAD
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
=======
>>>>>>> Backend
}
