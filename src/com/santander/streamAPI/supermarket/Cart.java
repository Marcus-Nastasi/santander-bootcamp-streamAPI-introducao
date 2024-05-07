package com.santander.streamAPI.supermarket;

import java.util.ArrayList;

public class Cart {

    private final ArrayList<Item> itemsList = new ArrayList<>();

    public Cart() {}

    public void addItem(Item item) {
        this.itemsList.add(item);
    }

    public double calcTotal() throws RuntimeException {
        if(this.itemsList.isEmpty()) throw new RuntimeException("Cart empty");
        return this.itemsList.stream().mapToDouble(i -> i.getPrice() * i.getQuantity()).sum();
    }
}


