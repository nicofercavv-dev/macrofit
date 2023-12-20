package com.example.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.model.Food;

public interface FoodService {

    List<Food> findAllFoods() throws DataAccessException;
    Food findFoodById(long id) throws DataAccessException;
    List<Food> findFoodByName(String name) throws DataAccessException;
    void saveFood(Food food) throws DataAccessException;
    void deleteFood(Food food) throws DataAccessException;

}
