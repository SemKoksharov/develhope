package com.develhope.springhibernate.entities;

import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass
public class UpdAtCreatedAt {

    private LocalDateTime updatedAt ;
    private LocalDateTime createdAt = LocalDateTime.now();

}
