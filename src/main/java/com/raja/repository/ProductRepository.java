package com.raja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raja.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
