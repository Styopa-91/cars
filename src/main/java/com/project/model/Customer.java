package com.project.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue
    @Column(name="id")
    private UUID id;

    @Column(name="first_name")
    @Size(min = 3, message = "firstName too short")
    @Size(max = 20, message = "firstName too long")
    @NotBlank
    private String firstName;

    @Column(name="last_name")
    @Size(min = 3, message = "lastName too short")
    @Size(max = 20, message = "lastName too long")
    @NotBlank
    private String lastName;


    @Column(name="email", unique = true)
    @Email
    private String email;

    @Column(name="phone")
    @NotBlank
    @Size(min = 5, message = "phone too short")
    @Size(max = 20, message = "phone too long")
    private String phone;

    @OneToMany(mappedBy="customer")
    private List<Order> orders;

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    private void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
