package com.abedkiloo.service;

import com.abedkiloo.models.Product;
import com.abedkiloo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    get product based on id
     */
    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }
    /*
    save product details
     */
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public String deleteProductById(int id) {
        String result;
        try {
            productRepository.deleteById(id);
            result="Succes product Deletion";
        }catch (Exception e ){
            result="Product with id not found";
        }
        return result;
    }
    /*
    update product details
     */
}
