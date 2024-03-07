package com.chaitanya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaitanya.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
