package org.example.banbanh_be.controller;

import org.example.banbanh_be.dto.CartDto;
import org.example.banbanh_be.model.Cart;
import org.example.banbanh_be.model.User;
import org.example.banbanh_be.repository.ICartRepo;
import org.example.banbanh_be.repository.IUserRepo;
import org.example.banbanh_be.service.impl.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("apiCart")
@RequestMapping("/api/cart")
@CrossOrigin
public class CartController {
    @Autowired
    private CartService cartService;
    @Autowired
    private IUserRepo userRepo;

    @Autowired
    private ICartRepo iCartRepo;

    @GetMapping("/{id}")
    public ResponseEntity<List<Cart>> findAll(@PathVariable int id) {
        List<Cart> cart = iCartRepo.findByUserId(id);
        if (cart.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cart> save(@ModelAttribute CartDto cartDto) {
        Cart cart = cartService.saveCart(cartDto);
        return new ResponseEntity<>(cart, HttpStatus.CREATED);
    }
}
