package com.project.dto;

import java.util.Set;
import java.util.UUID;

public class CustomerDTO {

    private UUID id;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private Set<OrderWithoutCarAndCustomerDTO> orders;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Set<OrderWithoutCarAndCustomerDTO> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrderWithoutCarAndCustomerDTO> orders) {
        this.orders = orders;
    }
}
