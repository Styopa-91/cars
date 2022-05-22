package com.project.mapper;

import com.project.DTO.OrderDTO;
import com.project.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    OrderDTO orderToOrderDTO(Order order);
    Order orderDTOToOrder(OrderDTO orderDTO);
    List<OrderDTO> orderToOrderDTOList(List<Order> orderList);

}
