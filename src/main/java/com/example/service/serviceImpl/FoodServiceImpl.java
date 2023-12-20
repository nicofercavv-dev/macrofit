package com.example.service.serviceImpl;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.orm.ObjectRetrievalFailureException;

import com.example.model.Food;
import com.example.repository.FoodRepository;
import com.example.service.FoodService;

import org.springframework.transaction.annotation.Transactional;

public class FoodServiceImpl implements FoodService {

    private FoodRepository foodRepository;

    public FoodServiceImpl(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Food> findAllFoods() throws DataAccessException {
        return foodRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Food findFoodById(long id) throws DataAccessException {
        Food food = null;
        try {
            food = foodRepository.findById(id);
        } catch (ObjectRetrievalFailureException|EmptyResultDataAccessException e) {
            return null;
        }

        return food;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Food> findFoodByName(String name) throws DataAccessException {
        return foodRepository.findByName(name);
    }

    @Override
    @Transactional
    public void saveFood(Food food) throws DataAccessException {
        foodRepository.save(food);
    }

    @Override
    @Transactional
    public void deleteFood(Food food) throws DataAccessException {
        foodRepository.delete(food);
    }

}
