package com.example.backendecom.repository;

import com.example.backendecom.domain.product.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface ProductRepository extends  JpaRepository<ProductEntity, Long>{
    Optional<ProductEntity> findById(String id);
    Optional<ProductEntity> deleteById(String id);
}
