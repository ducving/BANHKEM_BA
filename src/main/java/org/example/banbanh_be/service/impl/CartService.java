package org.example.banbanh_be.service.impl;

import org.example.banbanh_be.dto.CartDto;
import org.example.banbanh_be.model.Cake;
import org.example.banbanh_be.model.Cart;
import org.example.banbanh_be.repository.CakeRepo;
import org.example.banbanh_be.repository.ICartRepo;
import org.example.banbanh_be.repository.IUserRepo;
import org.example.banbanh_be.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Optional;
@Service
public class CartService implements ICartService {
    @Autowired
    private ICartRepo iCartRepo;
    @Autowired
    private IUserRepo iUserRepo;
    @Autowired
    private CakeRepo cakeRepo;


    @Override
    public Iterable<Cart> findAll() {
        return iCartRepo.findAll();
    }

    @Override
    public Optional<Cart> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Cart save(Cart cart) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Cart saveCart(CartDto cartDto)  {
        Cart cart=cartDto.toCart();
        cart.setUser(iUserRepo.findById(cartDto.getId_user()).get());
        cart.setCake(cakeRepo.findById(cartDto.getId_cake()).get());
        cart=iCartRepo.save(cart);
        return cart;
    }
}
