package com.project.service;

import com.project.dao.CarDao;
import com.project.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class CarServiceImpl implements CarService{
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> all() {
        return carDao.all();
    }

    @Override
    public void add(Car car) {
        carDao.add(car);
    }

    @Override
    public void delete(Car car) {
        carDao.delete(car);
    }

    @Override
    public void edit(Car car) {
        carDao.edit(car);
    }

    @Override
    public Car getById(UUID id) {
        return carDao.getById(id);
    }
}
