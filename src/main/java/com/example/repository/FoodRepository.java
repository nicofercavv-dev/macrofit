package com.example.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.model.Food;

/**
 * Interface for the Food repository
 * 
 * @author nicofercavv-dev
 */
public interface FoodRepository {
    
    List<Food> findAll() throws DataAccessException;
    Food findById(long id) throws DataAccessException;
    List<Food> findByName(String name) throws DataAccessException;
    void save(Food food) throws DataAccessException;
    void delete(Food food) throws DataAccessException;

}
