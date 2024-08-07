package org.example.banbanh_be.repository;

import org.example.banbanh_be.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
}
