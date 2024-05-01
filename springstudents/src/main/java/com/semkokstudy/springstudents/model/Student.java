package com.semkokstudy.springstudents.model;

import lombok.*;

import java.time.LocalDate;
@Data
@Builder

public class Student {


   private String name;
   private String surname;
   private LocalDate dateOfBirth;
   @NonNull
   private String email;
   private int age;

}
