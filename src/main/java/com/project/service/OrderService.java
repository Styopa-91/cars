package com.project.service;

import com.project.DTO.CarDTO;
import com.project.DTO.CustomerDTO;
import com.project.DTO.OrderDTO;
import java.util.List;
import java.util.UUID;

public interface OrderService {
    List<OrderDTO> all();
    OrderDTO create(String description, CustomerDTO customerDTO, CarDTO carDTO);
//    OrderDTO add(OrderDTO orderDTO);
    void delete(UUID id);
    OrderDTO edit(OrderDTO orderDTO);
    OrderDTO getById(UUID id);
}
