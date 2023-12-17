package com.example.backendecom.domain.product;

public record RequestProduct(
        String id,
        String code,
        String name,
        String description,
        Double price
    ) { }
