package com.safi.nepask.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class Users {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    private String firstname;
    private String lastname;
    private String fullname;
    @Email
    private String email;
    private Integer mobile;
    private String image;
    private String cover;
    private String slug;

    public String getFullname() {
        return fullname;
    }

    public void setFullname() {
        this.fullname = firstname+" "+lastname; 
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Users(Long id, String firstname, String lastname, String fullname, @Email String email, Integer mobile,
            String image, String cover, String slug) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.fullname = fullname;
        this.email = email;
        this.mobile = mobile;
        this.image = image;
        this.cover = cover;
        this.slug = slug;
    }
}