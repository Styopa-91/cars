package com.project.mapper;

import com.project.DTO.CustomerDTO;
import com.project.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    CustomerDTO customerToCustomerDTO(Customer customer);
    Customer customerDTOToCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> customerToCustomerDTOList(List<Customer> customerList);

}
