package com.project.dao;

import com.project.model.Car;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class CarDaoImpl extends GenericDaoImpl<Car> implements CarDao {
    @Autowired
    private SessionFactory sessionFactory;

}
