package com.project.mapper;

import com.project.dto.CustomerDTO;
import com.project.model.Customer;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDTO customerToCustomerDTO(Customer customer);
    Customer customerDTOToCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> customerToCustomerDTOList(List<Customer> customerList);

}
