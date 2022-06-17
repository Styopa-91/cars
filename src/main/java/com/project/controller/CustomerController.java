package com.project.controller;

import com.project.dto.CustomerDTO;
import com.project.dto.CustomerWithoutOrdersDTO;
import com.project.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping
    public List<CustomerDTO> all(){
        return customerService.all();
    }

    @GetMapping(value = "/{id}")
    public CustomerDTO getById(@PathVariable("id") UUID id ){
        return customerService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDTO add(@RequestBody CustomerDTO customerDTO){
      return customerService.add(customerDTO);

    }
    @PutMapping
    public CustomerWithoutOrdersDTO edit(@RequestBody CustomerWithoutOrdersDTO customerWithoutOrdersDTO){
        return customerService.edit(customerWithoutOrdersDTO);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") UUID id) {
        customerService.delete(id);
    }

}
