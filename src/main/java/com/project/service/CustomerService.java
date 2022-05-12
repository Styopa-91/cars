package com.project.service;

import com.project.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    List<Customer> all();
    void add(Customer customer);
    void delete(Customer customer);
    void edit(Customer customer);
    Customer getById(UUID id);
}
