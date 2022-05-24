package com.project.mapper;

import com.project.dto.OrderDTO;
import com.project.model.Order;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDTO orderToOrderDTO(Order order);
    Order orderDTOToOrder(OrderDTO orderDTO);
    List<OrderDTO> orderToOrderDTOList(List<Order> orderList);

}
