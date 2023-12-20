package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
    
}
