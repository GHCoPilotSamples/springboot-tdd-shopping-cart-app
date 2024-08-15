package com.example.shoppingcart.service;

import com.example.shoppingcart.model.Item;
import com.example.shoppingcart.model.Order;
import com.example.shoppingcart.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ShoppingCartService {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public Order createOrder(String userId, List<Item> items, Date orderDate) {
        Order order = new Order(null, userId, items, orderDate);
        return shoppingCartRepository.save(order);
    }
    public void deleteOrder(String orderId) {
        if (shoppingCartRepository.existsById(orderId)) {
            shoppingCartRepository.deleteById(orderId);
        }
    }
}