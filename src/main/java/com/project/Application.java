//package com.project;


import com.project.model.Car;
import com.project.model.Customer;
import com.project.model.Order;
import com.project.service.CarService;
import com.project.service.CustomerService;
import com.project.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.UUID;

//
//public class Application {
//    public static void main(String[] args) {
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
//        System.out.println("Hello");
//
//        CustomerService customerService = applicationContext.getBean(CustomerService.class);
//        CarService carService = applicationContext.getBean(CarService.class);
//        OrderService orderService = applicationContext.getBean(OrderService.class);
//        System.out.println(orderService.all());
//        Order order = orderService.getById(UUID.fromString("b340fd3e-69f9-48e8-bdc4-863cf8d9165b"));
//        orderService.delete(order);

//        Order order1 = new Order();

//        Customer cust = customerService.getById(UUID.fromString("a77fcc15-6800-4422-ad07-70a5d35417b6"));
//
//        cust.setPhone("333333333");
//        customerService.delete(cust);
//        Car car = carService.getById(UUID.fromString("bc522539-3314-45ff-adb8-fef5b623fef4"));
//
//        System.out.println(orderService.all());
//          carService.delete(car);
//        orderService.create("order_6", cust, car);
//        orderService.add(order2);

//        Customer cust = new Customer();
//        cust.setFirstName("");
//        cust.setLastName("biden");
//        cust.setEmail("77777107@gmail.com");
//        cust.setPhone("0507757677");
//        customerService.add(cust);

//        System.out.println(customerService.all());
//
//
//        customerService.add(cust);

//

//        Car car = new Car();
//        car.setModel("bmw_3");
//        car.setColor("gray");
//        car.setPrice(6000);
//
//        carService.add(car);
//        carService.delete(car3);

////        System.out.println(carService.all());
//    }
//}
