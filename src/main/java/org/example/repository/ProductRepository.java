package org.example.repository;
import org.example.entity.Product;
import org.example.entity.User;

import java.util.List;
public class ProductRepository implements BaseRepository<Product> {

    @Override
    public Product add(Product element) {
        return null;
    }

    @Override
    public boolean delete(Product element) {
        return false;
    }

    @Override
    public Product update(Product element) {
        return null;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
        return List.of();
    }
}
