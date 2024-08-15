package com.example.shoppingcart.service;

import com.example.shoppingcart.model.Item;
import com.example.shoppingcart.model.Order;
import com.example.shoppingcart.repository.ShoppingCartRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class OrderServiceTest {

    @Mock
    private ShoppingCartRepository shoppingCartRepository;

    @InjectMocks
    private ShoppingCartService shoppingCartService;

    private String userId;
    private List<Item> items;
    private Date orderDate;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        userId = "user1";
        items = new ArrayList<>();
        items.add(new Item("item1", "Item 1", 10.0));
        items.add(new Item("item2", "Item 2", 20.0));
        orderDate = new Date();
    }

    @Test
    public void testOrderCreation() {
        Order order = new Order(null, userId, items, orderDate);
        when(shoppingCartRepository.save(order)).thenAnswer(invocation -> {
            Order savedOrder = invocation.getArgument(0);
            savedOrder.setOrderId("generatedOrderId");
            return savedOrder;
        });

        Order createdOrder = shoppingCartService.createOrder(userId, items, orderDate);
        assertNotNull(createdOrder.getOrderId());
    }

    //create a test to delete an order using orderid
    @Test
    public void testOrderDeletion() {
        Order order
                = new Order("12345", userId, items, orderDate);
        when(shoppingCartRepository.existsById(order.getOrderId())).thenReturn(true);
        shoppingCartService.deleteOrder(order.getOrderId());
    }

}