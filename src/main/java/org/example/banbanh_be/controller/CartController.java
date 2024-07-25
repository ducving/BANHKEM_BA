package org.example.banbanh_be.controller;

import org.example.banbanh_be.dto.CartDto;
import org.example.banbanh_be.model.Cart;
import org.example.banbanh_be.repository.ICartRepo;
import org.example.banbanh_be.service.impl.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("apiCart")
@RequestMapping("/api/cart")
@CrossOrigin
public class CartController {
    @Autowired
    private CartService cartService;

    @Autowired
    private ICartRepo iCartRepo;

    @GetMapping
    public ResponseEntity<Iterable<Cart>>findAll(){
        List<Cart> cartList = (List<Cart>)cartService.findAll();
        return new ResponseEntity<>(cartList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cart> save(@ModelAttribute CartDto cartDto) {
        Cart cart = cartService.saveCart(cartDto);
        return new ResponseEntity<>(cart, HttpStatus.CREATED);
    }
}
