package com.project.service;

import com.project.dao.CustomerDao;
import com.project.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> all() {
        return customerDao.all();
    }

    @Override
    public void add(Customer customer) {
        customerDao.add(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerDao.delete(customer);
    }

    @Override
    public void edit(Customer customer) {
        customerDao.edit(customer);
    }

    @Override
    public Customer getById(UUID id) {
        return customerDao.getById(id);
    }
}
