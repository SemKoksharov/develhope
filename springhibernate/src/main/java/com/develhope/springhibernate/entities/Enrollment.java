package com.develhope.springhibernate.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "enrollments")
public class Enrollment extends UpdAtCreatedAt{

    @Id
    @GeneratedValue
    @Column(name = "enrollment_id")
    private Long id;
    private LocalDateTime enrollmentDate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    private Class aClass;

}
