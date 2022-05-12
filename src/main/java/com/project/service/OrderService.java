package com.project.service;

import com.project.model.Car;
import com.project.model.Customer;
import com.project.model.Order;
import java.util.List;
import java.util.UUID;

public interface OrderService {
    List<Order> all();
    void create(String description, Customer customer, Car car);
    void add(Order order);
    void delete(Order order);
    void edit(Order order);
    Order getById(UUID id);
}
