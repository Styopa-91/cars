package com.project.mapper;

import com.project.DTO.OrderWithoutCarAndCustomerDTO;
import com.project.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderWithoutCustomerAndCarMapper {
    OrderWithoutCustomerAndCarMapper INSTANCE = Mappers.getMapper(OrderWithoutCustomerAndCarMapper.class);
    OrderWithoutCarAndCustomerDTO orderToOrderDTO(Order order);
    Order orderDTOToOrder(OrderWithoutCarAndCustomerDTO orderWithoutCarAndCustomerDTO);
    List<OrderWithoutCarAndCustomerDTO> orderToOrderDTOList(List<Order> orderList);
}
