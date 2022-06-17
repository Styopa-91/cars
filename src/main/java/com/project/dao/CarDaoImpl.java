package com.project.dao;

import com.project.model.Car;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CarDaoImpl extends GenericDaoImpl<Car> implements CarDao {
    @Override
    public List<Car> all(){
        Session session = getSessionFactory();
        return session.createQuery("from Car car order by car.model", Car.class).getResultList();
    }



}
