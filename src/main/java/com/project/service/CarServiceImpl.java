package com.project.service;

import com.project.dto.CarDTO;
import com.project.dao.CarDao;
import com.project.mapper.CarMapper;
import com.project.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class CarServiceImpl implements CarService{
    @Autowired
    private CarDao carDao;
    @Autowired
    private CarMapper carMapper;

    @Override
    public List<CarDTO> all() {
        return carMapper.carToCarDTOList(carDao.all());
    }

    @Override
    public CarDTO getById(UUID id) {
        Car car = carDao.getById(id);
        return carMapper.carToCarDTO(car);
    }

    @Override
    public CarDTO add(CarDTO carDTO) {
        Car car = carMapper.carDTOToCar(carDTO);
        carDao.add(car);
        return carMapper.carToCarDTO(car);
    }

    @Override
    public CarDTO edit(CarDTO carDTO) {
        Car car = carMapper.carDTOToCar(carDTO);
        return carMapper.carToCarDTO(carDao.edit(car));
    }

    @Override
    public void delete(UUID id) {
        carDao.delete(id);
    }

}
