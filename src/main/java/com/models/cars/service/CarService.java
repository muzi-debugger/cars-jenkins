package com.models.cars.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.models.cars.domain.Car;
import com.models.cars.repository.CarsRepository;

@Service
public class CarService {
    private final CarsRepository repository;
    public CarService(CarsRepository repository) { this.repository = repository; }
    public List<Car> getAllCars() { return repository.findAll(); }
    public List<Car> getCarsByManufacturer(String manufacturer) { return repository.findByManufacturer(manufacturer); }
    public void saveAll(List<Car> cars) { repository.saveAll(cars); }
}
