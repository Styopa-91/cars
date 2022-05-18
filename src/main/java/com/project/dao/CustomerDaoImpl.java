package com.project.dao;

import com.project.model.Customer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class CustomerDaoImpl extends GenericDaoImpl<Customer> implements CustomerDao{
    @Autowired
    private SessionFactory sessionFactory;

}
