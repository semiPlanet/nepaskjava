package com.safi.nepask.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "questions")
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long user_id;

    @Column(name = "public")
    private Boolean pub;

    private String question;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private String slug;
    private String language;


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String lang) {
        this.language = lang;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Boolean getPug() {
        return pub;
    }

    public void setPub(Boolean pub) {
        this.pub = pub;
    }

    public Questions(Long id, Long user_id, Boolean pub, String question, LocalDateTime created_at,
            LocalDateTime updated_at, String slug, String language) {
        this.id = id;
        this.user_id = user_id;
        this.pub = pub;
        this.question = question;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.slug = slug;
        this.language = language;
    }

}