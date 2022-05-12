package com.project.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;


@Entity
@Table(name="orders", uniqueConstraints = {
        @UniqueConstraint(name = "UniqueCustomerAndCar", columnNames = {"car_id", "customer_id"})})
public class Order {

    @Id
    @GeneratedValue
    @Column(name="id")
    private UUID id;

    @Column(name = "description")
    private String description;



    @Column(name="created_at")
    @CreationTimestamp
    private Timestamp createdAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "createdAt=" + createdAt +
                ", car=" + car +
                ", customer=" + customer +
                '}';
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
