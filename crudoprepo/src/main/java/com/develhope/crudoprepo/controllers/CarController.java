package com.develhope.crudoprepo.controllers;

import com.develhope.crudoprepo.entities.Car;
import com.develhope.crudoprepo.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/cars")
public class CarController {

    private final CarRepository carRepository;

    @Autowired
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping
    public Page<Car> getAllCars(@RequestParam(required = false) Optional<Integer> page, @RequestParam(required = false) Optional<Integer> size) {
        if (page.isPresent() && size.isPresent()) {
            Sort sort = Sort.by(new Sort.Order(Sort.Direction.DESC, "type"));

            Pageable pageable = PageRequest.of(page.get(), size.get(), sort);
            Page<Car> carsPaginated = carRepository.findAll(pageable);

            return carsPaginated;
        } else {
          //return empty page
    // SAY NO TO RETURN OF OBJECT!!!!!
            return Page.empty();
        }
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id) {
        if (!carRepository.existsById(id)) {
            Car emptyCar = new Car();
            return emptyCar;
        }
        return carRepository.findById(id).get();
    }

    @PostMapping("/create_car")
    public Car createCar(@RequestBody Car car) {
        Car saved = carRepository.saveAndFlush(car);
        return saved;
    }

    @PostMapping("create_cars")
    public List<Car> createCars(@RequestBody List<Car> cars) {
        List<Car> saved = carRepository.saveAllAndFlush(cars);
        return saved;
    }

    @PutMapping("/update_type/{id}")
    public Car updateTypeOfCar(@PathVariable Long id, @RequestParam String type) {
        Car car = getCarById(id);
        car.setType(type);
        Car updated = carRepository.saveAndFlush(car);
        return updated;
    }

    @PutMapping("/update_car/{id}")
    public Car updateCarById(@PathVariable Long id, @RequestBody Car car) {
        car.setId(id);
        Car updated = carRepository.saveAndFlush(car);
        return updated;
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Long id) {
        if (!carRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        carRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/delete_many")
    public String deleteMany(@RequestParam List<Long> ids) {
        carRepository.deleteAllById(ids);
        return "Cars with ids: " +
                ids + "  deleted";
    }

    @DeleteMapping("/delete_all")
    public String deleteAll() {
        carRepository.deleteAll();
        return "All cars deleted";
    }
}
