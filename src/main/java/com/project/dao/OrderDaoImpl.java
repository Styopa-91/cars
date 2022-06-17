package com.project.dao;

import com.project.model.Car;
import com.project.model.Order;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDaoImpl extends GenericDaoImpl<Order> implements OrderDao {
    @Override
    public List<Order> all(){
        Session session = getSessionFactory();
        return session.createQuery("from Order order order by order.createdAt desc", Order.class).getResultList();
    }
}
