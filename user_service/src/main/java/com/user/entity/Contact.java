package com.user.entity;

import jakarta.persistence.*;

@Entity
@Table(name="contact")
public class Contact {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long cId;
    private String email;
    private String contactName;
    private long userid;

    public Contact() {
    }

    public Contact(long cId, String email, String contactName, long userid) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        this.userid = userid;
    }

    public long getcId() {
        return cId;
    }

    public void setcId(long cId) {
        this.cId = cId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }
}
