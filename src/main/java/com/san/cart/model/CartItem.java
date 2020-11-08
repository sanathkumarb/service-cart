package com.san.cart.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CartItem {

    @JsonProperty("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @JsonProperty("color")
    private String color;
}
