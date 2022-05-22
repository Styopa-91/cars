package com.project.service;

import com.project.DTO.CustomerDTO;
import com.project.dao.CustomerDao;
import com.project.mapper.CustomerMapper;
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
    public List<CustomerDTO> all() {
        return CustomerMapper.INSTANCE.customerToCustomerDTOList(customerDao.all());
    }

    @Override
    public CustomerDTO getById(UUID id) {
        Customer customer = customerDao.getById(id);
        return CustomerMapper.INSTANCE.customerToCustomerDTO(customer);
    }

    @Override
    public CustomerDTO add(CustomerDTO customerDTO) {
        Customer customer = CustomerMapper.INSTANCE.customerDTOToCustomer(customerDTO);
        customerDao.add(customer);
        return CustomerMapper.INSTANCE.customerToCustomerDTO(customer);
    }

    @Override
    public CustomerDTO edit(CustomerDTO customerDTO) {
        Customer customer = CustomerMapper.INSTANCE.customerDTOToCustomer(customerDTO);
        customerDao.edit(customer);
        return CustomerMapper.INSTANCE.customerToCustomerDTO(customer);
    }

    @Override
    public void delete(UUID id) {
        customerDao.delete(id);
    }

}
