package com.example.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GenerationType;

@Entity(name = "meal")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private double totalCalories;
    private double totalCarbohydrate;
    private double totalProtein;
    private double totalFat;

    @OneToMany(mappedBy = "meal")
    private List<Food> foods;

    public Meal(String name, double totalCalories, double totalCarbohydrate, double totalProtein, double totalFat,
            List<Food> foods) {
        this.name = name;
        this.totalCalories = totalCalories;
        this.totalCarbohydrate = totalCarbohydrate;
        this.totalProtein = totalProtein;
        this.totalFat = totalFat;
        this.foods = foods;
    }

    public Meal() {}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }

    public double getTotalCarbohydrate() {
        return totalCarbohydrate;
    }

    public void setTotalCarbohydrate(double totalCarbohydrate) {
        this.totalCarbohydrate = totalCarbohydrate;
    }

    public double getTotalProtein() {
        return totalProtein;
    }

    public void setTotalProtein(double totalProtein) {
        this.totalProtein = totalProtein;
    }

    public double getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(double totalFat) {
        this.totalFat = totalFat;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(totalCalories);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalCarbohydrate);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalProtein);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalFat);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((foods == null) ? 0 : foods.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Meal other = (Meal) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(totalCalories) != Double.doubleToLongBits(other.totalCalories))
            return false;
        if (Double.doubleToLongBits(totalCarbohydrate) != Double.doubleToLongBits(other.totalCarbohydrate))
            return false;
        if (Double.doubleToLongBits(totalProtein) != Double.doubleToLongBits(other.totalProtein))
            return false;
        if (Double.doubleToLongBits(totalFat) != Double.doubleToLongBits(other.totalFat))
            return false;
        if (foods == null) {
            if (other.foods != null)
                return false;
        } else if (!foods.equals(other.foods))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Meal [id=" + id + ", name=" + name + ", totalCalories=" + totalCalories + ", totalCarbohydrate="
                + totalCarbohydrate + ", totalProtein=" + totalProtein + ", totalFat=" + totalFat + ", foods=" + foods
                + "]";
    }
}
