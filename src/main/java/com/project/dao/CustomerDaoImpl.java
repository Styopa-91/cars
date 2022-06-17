package com.project.dao;

import com.project.model.Car;
import com.project.model.Customer;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImpl extends GenericDaoImpl<Customer> implements CustomerDao{
    @Override
    public List<Customer> all(){
        Session session = getSessionFactory();
        return session.createQuery("from Customer customer order by customer.firstName", Customer.class).getResultList();
    }

}
