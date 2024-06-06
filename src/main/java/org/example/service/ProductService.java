package org.example.service;

import org.example.entity.Product;
import org.example.repository.ProductRepository;

import java.util.List;

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findByName(String searchedWord){
        return productRepository.findByName(searchedWord);


    }



}
