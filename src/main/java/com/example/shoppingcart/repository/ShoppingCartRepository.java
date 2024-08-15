package com.example.shoppingcart.repository;

import com.example.shoppingcart.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<Order, String> {
}