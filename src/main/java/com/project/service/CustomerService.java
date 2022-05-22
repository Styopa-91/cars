package com.project.service;

import com.project.DTO.CustomerDTO;
import java.util.List;
import java.util.UUID;

public interface CustomerService {
    List<CustomerDTO> all();
    CustomerDTO add(CustomerDTO customerWithoutOrdersDTO);
    void delete(UUID id);
    CustomerDTO edit(CustomerDTO customerDTO);
    CustomerDTO getById(UUID id);
}
