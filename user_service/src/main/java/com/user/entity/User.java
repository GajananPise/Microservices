package com.user.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="uname")
    private String name;
    private String phone;

    List<Contact> contacts = new ArrayList<Contact>();

    public User(int userId, String name, String phone, List<Contact> contacts) {
        this.id = userId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    public User(int userId, String name, String phone) {
        this.id = userId;
        this.name = name;
        this.phone = phone;
    }

    public User() {
    }

    public int getUserId() {
        return id;
    }

    public void setUserId(int userId) {
        this.id = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

   public List<Contact> getContacts() {
      return contacts;
}

public void setContacts(List<Contact> contacts) {
  this.contacts = contacts;
}
}
