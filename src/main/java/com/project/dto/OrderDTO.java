package com.project.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Timestamp;
import java.util.UUID;

public class OrderDTO {

    private UUID id;

    private String description;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone="Europe/Bucharest")
    private Timestamp createdAt;

    private CustomerWithoutOrdersDTO customer;

    private CarDTO car;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public CustomerWithoutOrdersDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerWithoutOrdersDTO customer) {
        this.customer = customer;
    }

    public CarDTO getCar() {
        return car;
    }

    public void setCar(CarDTO car) {
        this.car = car;
    }
}
