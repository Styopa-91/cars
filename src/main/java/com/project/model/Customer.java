package com.project.model;


import javax.persistence.*;
import javax.validation.constraints.Size;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue
    @Column(name="id")
    private UUID id;

    @Column(name="first_name")
    @Size(min = 3, message = "firstName too short")
    @Size(max = 20, message = "firstName too long")
    private String firstName;

    @Column(name="last_name")
    private String lastName;


    @Column(name="email", unique = true)
    private String email;

    @Column(name="phone")
    private String phone;

    @OneToMany(mappedBy="customer")
    private Set<Order> orders;

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

//    public Set<Order> getOrders() {
//        return orders;
//    }

    private void setOrders(Set<Order> orders) {
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



}
