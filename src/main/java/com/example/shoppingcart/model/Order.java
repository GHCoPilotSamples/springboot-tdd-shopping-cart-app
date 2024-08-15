package com.example.shoppingcart.model;

import java.util.Date;
import java.util.List;

public class Order {

    // Attributes
    private String orderId;
    private String userId;
    private List<Item> items;
    private Date orderDate;

    // Constructor
    public Order(String orderId, String userId, List<Item> items, Date orderDate) {
        this.orderId = orderId;
        this.userId = userId;
        this.items = items;
        this.orderDate = orderDate;
    }

    //Generate getters and setters

    public List<Item> getItems() {
        return items;
    }                   
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}


  