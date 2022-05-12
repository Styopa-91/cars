package com.project.dao;

import com.project.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.UUID;
@Transactional
@Repository
public class CustomerDaoImpl extends GenericDaoImpl<Customer> implements CustomerDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> all() {
            Session session = sessionFactory.getCurrentSession();
            return session.createQuery("from Customer").list();
    }

//    @Override
//    public void add(Customer customer) {
//            Session session = sessionFactory.getCurrentSession();
//            session.persist(customer);
//    }
//
//    @Override
//    public void delete(Customer customer) {
//            Session session = sessionFactory.getCurrentSession();
//            session.delete(customer);
//    }
//
//    @Override
//    public void edit(Customer customer) {
//            Session session = sessionFactory.getCurrentSession();
//            session.update(customer);
//    }

    @Override
    public Customer getById(UUID id) {
            Session session = sessionFactory.getCurrentSession();
            return session.get(Customer.class, id);
    }
}
