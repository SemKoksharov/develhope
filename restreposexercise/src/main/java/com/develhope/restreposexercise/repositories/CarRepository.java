package com.develhope.restreposexercise.repositories;

import com.develhope.restreposexercise.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends JpaRepository <Car, Long> {
}
