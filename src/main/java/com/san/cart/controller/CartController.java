package com.san.cart.controller;


import com.san.cart.model.CartItem;
import com.san.cart.model.CartResponse;
import com.san.cart.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class CartController {

 // Field Based
    @Autowired
    private ItemService itemService;


 /*
    Setter based
    @Autowired
    private void setItemService(ItemService cartItems)
    {
        this.itemService = cartItems;
    }
*/
 //   CartController(ItemService itemService)

    @GetMapping(value = "/getCartItems", produces = MediaType.APPLICATION_JSON_VALUE)
    public CartResponse getCartItems(){

        List<CartItem> cart = itemService.getCartItems();

        //populate cart response
        CartResponse cartResponse = new CartResponse();
        cartResponse.setCartItems(cart);

        return cartResponse;

    }
}
