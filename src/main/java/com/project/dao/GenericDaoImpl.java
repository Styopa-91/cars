package com.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class GenericDaoImpl <T> implements GenericDao <T>{
    @Autowired
    private SessionFactory sessionFactory;



    @Override
    public void add(T t) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(t);
    }

    @Override
    public void delete(T t) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(t);
    }

    @Override
    public void edit(T t) {
        Session session = sessionFactory.getCurrentSession();
        session.update(t);
    }

//    @Override
//    public T getById(UUID id) {
//        Session session = sessionFactory.getCurrentSession();
//        return session.get(T.class, id);
//    }
}
