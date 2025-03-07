package com.models.cars.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.models.cars.domain.Car;
import com.models.cars.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {
    private final CarService service;
    public CarController(CarService service) { this.service = service; }

    @GetMapping
    public List<Car> getAllCars() { return service.getAllCars(); }

    @GetMapping("/{manufacturer}")
    public List<Car> getCarsByManufacturer(@PathVariable String manufacturer) {
        return service.getCarsByManufacturer(manufacturer);
    }
}
