package com.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.UUID;

public abstract class GenericDaoImpl <T> implements GenericDao <T>{
    @Autowired
    protected SessionFactory sessionFactory;

    @Override
    public Class<T> getClas(){
        return (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public List<T> all(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from "+ getClas().getName(), getClas()).getResultList();
    }


    @Override
    public T add(T t) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(t);
        return t;
    }

    @Override
    public void delete(UUID id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(getById(id));
    }

    @Override
    public T edit(T t) {
        Session session = sessionFactory.getCurrentSession();
        session.update(t);
        return t;
    }

    public Session getSessionFactory() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public T getById(UUID id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(getClas(), id);
    }
}
