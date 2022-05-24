package com.project.service;

import com.project.dto.CustomerDTO;
import com.project.dao.CustomerDao;
import com.project.dto.CustomerWithoutOrdersDTO;
import com.project.mapper.CustomerMapper;
import com.project.mapper.CustomerWithoutOrdersMapper;
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
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private CustomerWithoutOrdersMapper customerWithoutOrdersMapper;

    @Override
    public List<CustomerDTO> all() {
        return customerMapper.customerToCustomerDTOList(customerDao.all());
    }

    @Override
    public CustomerDTO getById(UUID id) {
        Customer customer = customerDao.getById(id);
        return customerMapper.customerToCustomerDTO(customer);
    }

    @Override
    public CustomerDTO add(CustomerDTO customerDTO) {
        Customer customer = customerMapper.customerDTOToCustomer(customerDTO);
        customerDao.add(customer);
        return customerMapper.customerToCustomerDTO(customer);
    }

    @Override
    public CustomerWithoutOrdersDTO edit(CustomerWithoutOrdersDTO customerWithoutOrdersDTO) {
        Customer customer = customerWithoutOrdersMapper.customerWithoutOrdersDTOToCustomer(customerWithoutOrdersDTO);
        customerDao.edit(customer);
        return customerWithoutOrdersMapper.customerToCustomerWithoutOrdersDTO(customer);
    }

    @Override
    public void delete(UUID id) {
        customerDao.delete(id);
    }

}
