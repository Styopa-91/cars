package com.project.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue
    @Column(name="id")
    private UUID id;

    @Column(name="model")
    @Size(min = 3, max = 20)
    @NotBlank
    private String model;

    @Column(name="color")
    @NotBlank
    private String color;

    @Column(name="price")
    @Min(300)
    private float price;

    @Column(name="vin_code", unique = true)
    @NotBlank
    @Size(min = 17, max = 17)
    private String vinCode;

    @OneToOne(mappedBy = "car",fetch = FetchType.LAZY)
    private Order order;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", vin_code='" + vinCode + '\'' +
                '}';
    }

    public UUID getId() { return id;  }

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

    public String getVin_code() { return vinCode; }

    public void setVin_code(String vin_code) { this.vinCode = vin_code; }

    public Order getOrder() { return order;  }

    public void setOrder(Order order) {
        this.order = order;
    }

}
