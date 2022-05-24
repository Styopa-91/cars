package com.project.service;

import com.project.dto.OrderDTO;
import java.util.List;
import java.util.UUID;

public interface OrderService {
    List<OrderDTO> all();
    OrderDTO create(OrderDTO orderDTO);
    OrderDTO edit(OrderDTO orderDTO);
    OrderDTO getById(UUID id);
    void delete(UUID id);
}
