package com.everis.delivery.model;

import lombok.extern.java.Log;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    //@Column(nullable = false)
    //private String tokenAccess;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Log> log;

    public User() {}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //public String getTokenAccess() {
        //return tokenAccess;
    //}

    //public void setTokenAccess(String tokenAccess) {
       // this.tokenAccess = tokenAccess;
    //}

    public List<Log> getLog() {
        return log;
    }

    public void setLog(List<Log> log) {
        this.log = log;
    }

}
