package com.example.backendecom.controllers;

import com.example.backendecom.domain.product.ProductEntity;
import com.example.backendecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public Object findAllProducts(){
        return  service.getAllProduct();
    }
    @PostMapping("/products")
    public ProductEntity postProduct(@RequestBody ProductEntity product){
        return  service.addProduct(product);
    }

    @PutMapping("/products")
    public ProductEntity putProduct(@RequestBody ProductEntity product){
        return  service.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable String id) {
        return service.deleteProduct(id);
    }
}
