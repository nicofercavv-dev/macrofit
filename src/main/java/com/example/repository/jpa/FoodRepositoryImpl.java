package com.example.repository.jpa;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.model.Food;
import com.example.repository.FoodRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;


@Repository
public class FoodRepositoryImpl implements FoodRepository {

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<Food> findAll() throws DataAccessException {
        Query query = this.em.createQuery("SELECT food FROM Food food");
        return query.getResultList();
    }

    @Override
    public Food findById(long id) throws DataAccessException {
        Query query = this.em.createQuery("SELECT food FROM Food food WHERE food.id =:id");
        query.setParameter("id", id);
        return (Food) query.getSingleResult();
    }

    @SuppressWarnings("unchecked")
    public List<Food> findByName(String name) throws DataAccessException {
        Query query = this.em.createQuery("SELECT food FROM Food food WHERE food.name LIKE :name");
        query.setParameter("name", name + "%");
        return query.getResultList();
    }

    @Override
    public void save(Food food) throws DataAccessException {
        if (food.getId() == 0) {
            this.em.persist(food);
        } else {
            this.em.merge(food);
        }
    }

    @Override
    public void delete(Food food) throws DataAccessException {
        this.em.remove(food);
    }

}
