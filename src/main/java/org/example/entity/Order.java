package org.example.entity;

import java.util.List;

public class Order {
    private int id;

    private List<Product> products;

    public Order(int id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void clearProducts() {
        products.clear();
    }

    public void printProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public String toString() {
        return "| Order | " + "id=" + id + ", products=" + products + '}';
    }







}


