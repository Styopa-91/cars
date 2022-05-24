package com.project.mapper;

import com.project.dto.CustomerWithoutOrdersDTO;
import com.project.model.Customer;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerWithoutOrdersMapper {
    CustomerWithoutOrdersDTO customerToCustomerWithoutOrdersDTO(Customer customer);
    Customer customerWithoutOrdersDTOToCustomer(CustomerWithoutOrdersDTO customerWithoutOrdersDTO);
    List<CustomerWithoutOrdersDTO> customerToCustomerWithoutOrdersDTOList(List<Customer> customerList);
}
