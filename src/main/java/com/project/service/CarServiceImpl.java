package com.project.service;

import com.project.DTO.CarDTO;
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

    @Override
    public List<CarDTO> all() {

        return CarMapper.INSTANCE.carToCarDTOList(carDao.all());
    }

    @Override
    public CarDTO add(CarDTO carDTO) {
        Car car = CarMapper.INSTANCE.carDTOToCar(carDTO);
        carDao.add(car);
        return CarMapper.INSTANCE.carToCarDTO(car);
    }

    @Override
    public void delete(UUID id) {
        carDao.delete(id);
    }

    @Override
    public CarDTO edit(CarDTO carDTO) {
        Car car = CarMapper.INSTANCE.carDTOToCar(carDTO);
        return CarMapper.INSTANCE.carToCarDTO(carDao.edit(car));
    }

    @Override
    public CarDTO getById(UUID id) {

        Car car = carDao.getById(id);
        return CarMapper.INSTANCE.carToCarDTO(car);
    }
}
