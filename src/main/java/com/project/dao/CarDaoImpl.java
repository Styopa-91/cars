package com.project.dao;

import com.project.model.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Transactional
@Repository
public class CarDaoImpl extends GenericDaoImpl<Car> implements CarDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Car> all() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Car").list();
    }

//    @Override
//    public void add(Car car) {
//        Session session = sessionFactory.getCurrentSession();
//        session.persist(car);
//    }
//
//    @Override
//    public void delete(Car car) {
//        Session session = sessionFactory.getCurrentSession();
//        session.delete(car);
//    }
//
//    @Override
//    public void edit(Car car) {
//        Session session = sessionFactory.getCurrentSession();
//        session.update(car);
//    }

    @Override
    public Car getById(UUID id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Car.class, id);
    }
}
