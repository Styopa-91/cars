package com.project.dao;

import com.project.model.Order;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class OrderDaoImpl extends GenericDaoImpl<Order> implements OrderDao {
    @Autowired
    private SessionFactory sessionFactory;

}
