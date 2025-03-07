package com.models.cars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.models.cars.domain.Car;



public interface CarsRepository extends JpaRepository<Car, Long> {
    List<Car> findByManufacturer(String manufacturer);
}
