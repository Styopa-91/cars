package com.project.service;

import com.project.dto.CarDTO;
import java.util.List;
import java.util.UUID;

public interface CarService {
    List<CarDTO> all();
    CarDTO add(CarDTO carDTO);
    void delete(UUID id);
    CarDTO edit(CarDTO carDTO);
    CarDTO getById(UUID id);
}
