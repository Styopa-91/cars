package com.project.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue
    @Column(name="id")
    private UUID id;

    @Column(name="model")
    private String model;

    @Column(name="color")
    private String color;

    @Column(name="price")
    private float price;

    @OneToOne(mappedBy = "car")
    private Order order;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void setId(UUID id) {
        this.id = id;
    }

    private void setOrder(Order order) {
        this.order = order;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public UUID getId() { return id;
    }
//    public Order getOrder() { return order;
//    }

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
}
