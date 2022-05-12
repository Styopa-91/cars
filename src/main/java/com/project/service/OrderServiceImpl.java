package com.project.service;

import com.project.dao.CarDao;
import com.project.dao.CustomerDao;
import com.project.dao.OrderDao;
import com.project.model.Car;
import com.project.model.Customer;
import com.project.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private CarDao carDao;

    @Override
    public List<Order> all() {
        return orderDao.all();
    }



    public void create(String description,Customer customer, Car car){
        Order order = new Order();
        order.setDescription(description);
        order.setCustomer(customer);
        order.setCar(car);


        this.add(order);
    }
    @Override
    public void add(Order order) {
        orderDao.add(order);
    }

    @Override
    public void delete(Order order) {
        orderDao.delete(order);
    }

    @Override
    public void edit(Order order) {
        orderDao.edit(order);
    }

    @Override
    public Order getById(UUID id) {
        return orderDao.getById(id);
    }
}
