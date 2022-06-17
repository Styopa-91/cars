package com.project.controller;

import com.project.dto.OrderDTO;
import com.project.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping
    public List<OrderDTO> all(){
        return  orderService.all();
    }

    @GetMapping(value = "/{id}")
    public OrderDTO getById(@PathVariable UUID id){
        return orderService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderDTO add(@RequestBody OrderDTO orderDTO){
       return orderService.create(orderDTO);

    }
    @PutMapping
    public OrderDTO edit(@RequestBody OrderDTO orderDTO){
        return orderService.edit(orderDTO);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") UUID id) {
        orderService.delete(id);
    }
}
