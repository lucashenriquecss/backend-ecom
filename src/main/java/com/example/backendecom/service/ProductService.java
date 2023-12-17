package com.example.backendecom.service;

import com.example.backendecom.domain.product.ProductEntity;
import com.example.backendecom.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;
import java.util.Objects;
@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<ProductEntity> getAllProduct(){
        return repository.findAll();
    }
    public ProductEntity addProduct(ProductEntity product) {return repository.save(product);}

    public ProductEntity updateProduct(ProductEntity product) {
        Optional<ProductEntity>  existingProduct = repository.findById(product.id);
        ProductEntity prod = existingProduct.get();

        if (existingProduct.isPresent()) {
            if (product.getCode() != null) {
                prod.setCode(product.getCode());
            }
            if (product.getName() != null) {
                prod.setName(product.getName());
            }
            if (product.getDescription() != null) {
                prod.setDescription(product.getDescription());
            }
            Integer price = product.getPrice();
            if (price != null && price != 0 ) {
                prod.setPrice(price);
            }

        }
        return repository.save(prod);
    }

    public String deleteProduct(String id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

}
