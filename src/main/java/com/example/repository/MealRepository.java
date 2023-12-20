package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Meal;

public interface MealRepository extends JpaRepository<Meal, Long> {

}
