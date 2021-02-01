package com.example.moderndashboard.ConfirmOrder;

public class OrderListModel {
String name;
int price;

    public OrderListModel() {
    }

    public OrderListModel(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
