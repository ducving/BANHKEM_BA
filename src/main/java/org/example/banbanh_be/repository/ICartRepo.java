package org.example.banbanh_be.repository;

import org.example.banbanh_be.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ICartRepo extends JpaRepository<Cart,Integer>, JpaSpecificationExecutor<Cart> {
}
