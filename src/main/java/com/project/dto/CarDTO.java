package com.project.dto;

import java.util.UUID;

public class CarDTO {

    private UUID id;

    private String model;

    private String color;

    private float price;

    private String vin_code;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getVin_code() { return vin_code; }

    public void setVin_code(String vin_code) { this.vin_code = vin_code; }
}
