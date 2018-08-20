package com.horis.foodorderplatfrom.orderservice.service.implement;

import com.horis.foodorderplatfrom.orderservice.domain.*;
import com.horis.foodorderplatfrom.orderservice.repository.OrderRepository;
import com.horis.foodorderplatfrom.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImplement implements OrderService {
    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImplement(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Order order) {
        order.setOrderTime(System.currentTimeMillis());
        order.setTotalPrice(order.getItems().stream().mapToInt(e -> e.getPrice() * e.getQuantity()).sum());
        return orderRepository.save(order);
    }
}
