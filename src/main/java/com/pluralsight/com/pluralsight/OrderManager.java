package com.pluralsight.com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }
    public void addOrder (Order order) {
        orders.add(order);
    }
}
