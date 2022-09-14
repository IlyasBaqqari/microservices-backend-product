package com.example.productbackend.repositories;

import com.example.productbackend.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Integer> {
}
