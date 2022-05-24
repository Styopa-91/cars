package com.project.model;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ss-MM-yyyy hh:mm:ss")
    private Timestamp createdAt;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    private Car car;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @Override
    public String toString() {
        return "Order{" +
                "createdAt=" + createdAt +
                ", car=" + car +
                ", customer=" + customer +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) { this.customer = customer; }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreatedAt() { return createdAt; }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
