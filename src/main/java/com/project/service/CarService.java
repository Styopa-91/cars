package com.project.service;

import com.project.model.Car;
import java.util.List;
import java.util.UUID;

public interface CarService {
    List<Car> all();
    void add(Car car);
    void delete(Car car);
    void edit(Car car);
    Car getById(UUID id);
}
