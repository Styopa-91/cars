package com.project.mapper;

import com.project.DTO.CustomerWithoutOrdersDTO;
import com.project.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerWithoutOrdersMapper {
    CustomerWithoutOrdersMapper INSTANCE = Mappers.getMapper(CustomerWithoutOrdersMapper.class);
    CustomerWithoutOrdersDTO customerToCustomerWithoutOrdersDTO(Customer customer);
    Customer customerWithoutOrdersDTOToCustomer(CustomerWithoutOrdersDTO customerWithoutOrdersDTO);
    List<CustomerWithoutOrdersDTO> customerToCustomerWithoutOrdersDTOList(List<Customer> customerList);
}
