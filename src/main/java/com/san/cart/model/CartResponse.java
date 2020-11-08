package com.san.cart.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CartResponse {
    @JsonProperty("cartItems")
    List<CartItem> cartItems;

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }


}
