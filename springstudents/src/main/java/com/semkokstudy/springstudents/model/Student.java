package com.semkokstudy.springstudents.model;

import lombok.*;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import org.springframework.lang.NonNull;

@Data
@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;

}




