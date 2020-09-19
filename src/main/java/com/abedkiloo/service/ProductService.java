package com.abedkiloo.service;

import com.abedkiloo.models.Product;
import com.abedkiloo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    /*
    get product details
     */
    public List<Product> fetchAllProducts() {
        return productRepository.findAll();
    }

    /*
    save product details
     */
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    /*
    update product details
     */
}
