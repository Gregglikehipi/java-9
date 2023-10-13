package com.example.spring.repository;

import com.example.spring.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Integer> {
    
}
