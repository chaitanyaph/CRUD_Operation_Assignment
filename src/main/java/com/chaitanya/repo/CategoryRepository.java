package com.chaitanya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaitanya.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
