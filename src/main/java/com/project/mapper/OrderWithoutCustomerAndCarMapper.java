package com.project.mapper;

import com.project.dto.OrderWithoutCarAndCustomerDTO;
import com.project.model.Order;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderWithoutCustomerAndCarMapper {
    OrderWithoutCarAndCustomerDTO orderToOrderDTO(Order order);
    Order orderDTOToOrder(OrderWithoutCarAndCustomerDTO orderWithoutCarAndCustomerDTO);
    List<OrderWithoutCarAndCustomerDTO> orderToOrderDTOList(List<Order> orderList);
}
