package com.project.dao;

import com.project.model.Order;

import java.util.List;
import java.util.UUID;

public interface OrderDao extends GenericDao<Order> {
    List<Order> all();
//    void add(Order order);
//    void delete(Order order);
//    void edit(Order order);
    Order getById(UUID id);
}
