package com.spring.radio.Domain;

import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "member")
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_member")
    private int id_member;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "role",insertable = false )
    private String role;

    @Column(name = "enabled", insertable = false)
    private boolean enabled;

    public Member(String username, String password, String role, boolean enabled) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.enabled = enabled;
    }

    public Member(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Member() {
    }

    public int getId_member() {
        return id_member;
    }

    public Member setId_member(int id_member) {
        this.id_member = id_member;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Member setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Member setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getRole() {
        return role;
    }

    public Member setRole(String role) {
        this.role = role;
        return this;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Member setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }




}
