package com.project.dao;

import com.project.model.Customer;


import java.util.List;
import java.util.UUID;

public interface CustomerDao extends GenericDao<Customer> {
    List<Customer> all();
//    void add(Customer customer);
//    void delete(Customer customer);
//    void edit(Customer customer);
    Customer getById(UUID id);
}
