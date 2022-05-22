package com.project.controller;

import com.project.DTO.CarDTO;
import com.project.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/car")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping
    public List<CarDTO> all(){
        return  carService.all();
    }

    @GetMapping(value = "/{id}")
    public CarDTO getById(@PathVariable UUID id){
        return carService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CarDTO add(@RequestBody CarDTO carDTO){
       return carService.add(carDTO);

    }
    @PutMapping
    public CarDTO edit(@RequestBody CarDTO carDTO){

        return carService.edit(carDTO);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") UUID id) {
        carService.delete(id);
    }
}
