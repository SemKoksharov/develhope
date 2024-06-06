package com.develhope.springiterceptors.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class User {

    private long id;
    private String name;
    private String surname;
    private String placeOfBirth;

    public User(long id, String name, String surname, String placeOfBirth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.placeOfBirth = placeOfBirth;
    }

    public User() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
}
