package com.abedkiloo.controllers;

import com.abedkiloo.models.Product;
import com.abedkiloo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductCrudController {
    @Autowired
    private ProductService productService;

    //    @RequestMapping(path = "/fetch_products", method = RequestMethod.GET)
    @GetMapping(path = "/v1/products")
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        /*fetch products from database */
        products = productService.fetchAllProducts();
        return products;
    }

    @PostMapping(path = "/v1/products")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
}
