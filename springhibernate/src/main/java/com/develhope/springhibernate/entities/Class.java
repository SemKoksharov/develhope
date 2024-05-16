package com.develhope.springhibernate.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

@Entity
@Table
@Data
public class Class extends UpdAtCreatedAt{

    @Id
    @GeneratedValue
    @Column(name = "class_id")
    private Long id;


    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

}
