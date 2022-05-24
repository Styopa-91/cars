package com.project.service;

import com.project.dto.CustomerDTO;
import com.project.dto.CustomerWithoutOrdersDTO;
import java.util.List;
import java.util.UUID;

public interface CustomerService {
    List<CustomerDTO> all();
    CustomerDTO add(CustomerDTO customerWithoutOrdersDTO);
    void delete(UUID id);
    CustomerWithoutOrdersDTO edit(CustomerWithoutOrdersDTO customerWithoutOrdersDTO);
    CustomerDTO getById(UUID id);
}
