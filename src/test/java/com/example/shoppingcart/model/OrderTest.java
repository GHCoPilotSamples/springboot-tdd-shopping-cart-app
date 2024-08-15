package com.example.shoppingcart.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    private Order order;
    private String orderId;
    private String userId;
    private List<Item> items;
    private Date orderDate;

    @BeforeEach
    public void setup() {
        orderId = "12345";
        userId = "user1";
        items = new ArrayList<>();
        items.add(new Item("item1", "Item 1", 10.0));
        items.add(new Item("item2", "Item 2", 20.0));
        orderDate = new Date();
        order = new Order(orderId, userId, items, orderDate);
    }

    @Test
    public void testOrderCreation() {
        assertEquals(orderId, order.getOrderId());
        assertEquals(userId, order.getUserId());
        assertEquals(items, order.getItems());
        assertEquals(orderDate, order.getOrderDate());
    }
}