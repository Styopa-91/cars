package com.project.dao;

import com.project.model.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Transactional
@Repository
public class OrderDaoImpl extends GenericDaoImpl<Order> implements OrderDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Order> all() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Order").list();
    }

//    @Override
//    public void add(Order order) {
//        Session session = sessionFactory.getCurrentSession();
//        session.persist(order);
//    }
//
//    @Override
//    public void delete(Order order) {
//        Session session = sessionFactory.getCurrentSession();
//        session.delete(order);
//    }
//
//    @Override
//    public void edit(Order order) {
//        Session session = sessionFactory.getCurrentSession();
//        session.update(order);
//    }

    @Override
    public Order getById(UUID id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Order.class, id);
    }
}
