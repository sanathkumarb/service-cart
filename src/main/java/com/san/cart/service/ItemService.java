package com.san.cart.service;

import com.san.cart.model.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ItemService {

    public List<CartItem> getCartItems() {

        // Creating CartItem 1
        CartItem cartItem1 = new CartItem();
        cartItem1.setName("pen");
        cartItem1.setColor("blue");

        // Creating CartItem 2
        CartItem cartItem2 = new CartItem();
        cartItem2.setName("pencil");
        cartItem2.setColor("red");

        //populate list of cartItems
        List<CartItem> cartItems = new ArrayList<>();
        cartItems.add(cartItem1);
        cartItems.add(cartItem2);

        return cartItems;

    }
}