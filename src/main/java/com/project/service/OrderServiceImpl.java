package com.project.service;

import com.project.dao.CarDao;
import com.project.dao.CustomerDao;
import com.project.dto.OrderDTO;
import com.project.dao.OrderDao;
import com.project.mapper.CarMapper;
import com.project.mapper.CustomerWithoutOrdersMapper;
import com.project.mapper.OrderMapper;
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
    private OrderMapper orderMapper;
    @Autowired
    private CarMapper carMapper;
    @Autowired
    private CustomerWithoutOrdersMapper customerWithoutOrdersMapper;
    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private CarDao carDao;

    @Override
    public List<OrderDTO> all() {
        return orderMapper.orderToOrderDTOList(orderDao.all());
    }

    @Override
    public OrderDTO getById(UUID id) {
        Order order = orderDao.getById(id);
        return orderMapper.orderToOrderDTO(order);
    }

    @Override
    public OrderDTO create(OrderDTO orderDTO) {

        Order order = orderMapper.orderDTOToOrder(orderDTO);
        return  orderMapper.orderToOrderDTO(orderDao.add(order));
    }

    @Override
    public OrderDTO edit(OrderDTO orderDTO) {
        Order order = orderMapper.orderDTOToOrder(orderDTO);
        return orderMapper.orderToOrderDTO(orderDao.edit(order));
    }

    @Override
    public void delete(UUID id) {
        orderDao.delete(id);
    }

}
