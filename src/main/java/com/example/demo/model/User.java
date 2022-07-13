package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "User_")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;
    @Column(name = "UserName")
    String userName;
    @Column(name = "Password")
    String password;
    @Column(name = "Email")
    String email;
    //Adres eklenicek
    @Column(name = "Active")
    private boolean active;
    @Column(name = "Role")
    private String roles;

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
