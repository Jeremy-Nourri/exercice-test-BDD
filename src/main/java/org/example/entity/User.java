package org.example.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;

    private List<Order> orders = new ArrayList<>();

    public User() {
    }

    public User(int id,String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "| User | " + "name=" + name + ", email=" + email + ", password=" + password + '}';
    }

    public String getUsername() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(orders, user.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, password, orders);
    }

    public String setName(String name) {
        return name;
    }

    public String setEmail(String email) {
        return email;
    }

    public String setPassword(String password) {
        return password;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
