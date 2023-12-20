package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Food;
import com.example.service.FoodService;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("api")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    public ResponseEntity<List<Food>> listFoods() {
        List<Food> foods = new ArrayList<>();
        foods.addAll(this.foodService.findAllFoods());
        if (foods.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(foods, HttpStatus.OK);
    }

}
