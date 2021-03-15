package com.ugromart.productsms.repository;

import com.ugromart.productsms.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
