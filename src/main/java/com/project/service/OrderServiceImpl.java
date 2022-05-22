package com.project.service;

import com.project.DTO.CarDTO;
import com.project.DTO.CustomerDTO;
import com.project.DTO.OrderDTO;
import com.project.dao.CarDao;
import com.project.dao.CustomerDao;
import com.project.dao.OrderDao;
import com.project.mapper.CarMapper;
import com.project.mapper.CustomerMapper;
import com.project.mapper.OrderMapper;
import com.project.model.Car;
import com.project.model.Customer;
import com.project.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private CarDao carDao;

    @Override
    public List<OrderDTO> all() {
        return OrderMapper.INSTANCE.orderToOrderDTOList(orderDao.all());
    }

    @Override
    public OrderDTO getById(UUID id) {
        Order order = orderDao.getById(id);
//        order.getCustomer();
        return OrderMapper.INSTANCE.orderToOrderDTO(order);
    }

    @Override
    public OrderDTO create(String description, CustomerDTO customerDTO, CarDTO carDTO) {

        Order order = new Order();
        Customer customer = CustomerMapper.INSTANCE.customerDTOToCustomer(customerDTO);
        Car car = CarMapper.INSTANCE.carDTOToCar(carDTO);
        order.setCustomer(customer);
        order.setCar(car);
        order.setDescription(description);
        orderDao.add(order);
        return  OrderMapper.INSTANCE.orderToOrderDTO(order);
    }

//    @Override
//    public OrderDTO add(OrderDTO orderDTO) {
//        Order order = OrderMapper.INSTANCE.orderDTOToOrder(orderDTO);
//        orderDao.add(order);
//        return OrderMapper.INSTANCE.orderToOrderDTO(order);
//    }

    @Override
    public OrderDTO edit(OrderDTO orderDTO) {
        Order order = OrderMapper.INSTANCE.orderDTOToOrder(orderDTO);
        return OrderMapper.INSTANCE.orderToOrderDTO(order);
    }

    @Override
    public void delete(UUID id) {
        orderDao.delete(id);
    }

}
