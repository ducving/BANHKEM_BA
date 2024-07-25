package org.example.banbanh_be.dto;

import org.example.banbanh_be.model.Cart;

public class CartDto {
    private int id;
    private int quantity;
    private int id_user;
    private int id_cake;


    public Cart toCart(){
        Cart cart = new Cart();
        cart.setId(id);
        cart.setQuantity(quantity);
        return cart;
    }

    public int getId() {
        return id;
    }

    public CartDto setId(int id) {
        this.id = id;
        return this;
    }



    public int getQuantity() {
        return quantity;
    }

    public CartDto setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_cake() {
        return id_cake;
    }

    public void setId_cake(int id_cake) {
        this.id_cake = id_cake;
    }
}
