package com.project;

import com.project.configuration.Config;
import com.project.model.Car;
import com.project.model.Customer;
import com.project.model.Order;
import com.project.service.CarService;
import com.project.service.CustomerService;
import com.project.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.UUID;


public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("Hello");

        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        CarService carService = applicationContext.getBean(CarService.class);
        OrderService orderService = applicationContext.getBean(OrderService.class);
//        Order order12 = orderService.getById(UUID.fromString("a412335b-2656-4892-aadc-16871aead40f"));
//        orderService.delete(order12);
//
//        Order order1 = new Order();
//
        Customer cust = customerService.getById(UUID.fromString("a1cb5021-493f-432e-a50d-7c82a8739c2a"));
        Car car = carService.getById(UUID.fromString("cf52aa02-5a78-437b-bc10-191b4b49ffad"));
//          carService.delete(car3);
        orderService.create("first desc",cust,car);
//        orderService.add(order2);

//        Customer cust1 = new Customer();
//        cust1.setFirstName("ivan");
//        cust1.setLastName("petrenko");
//        cust1.setEmail("ddd@gmail.com");
//        cust1.setPhone("05055555555");
//        customerService.add(cust1);
//
//
//        customerService.delete(cust2);

//

//        Car car1 = new Car();
//        car1.setModel("mercedes_E");
//        car1.setColor("white");
//        car1.setPrice(7000);
//
//          carService.add(car1);
//        carService.delete(car3);

//        System.out.println(carService.all());
    }
}
