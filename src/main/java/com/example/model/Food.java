package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

/**
 * @author nicofercavv-dev
 */
@Entity(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private double calories;
    private double totalCarbohydrate;
    private double liquidCarbohydrate;
    private double protein;
    private double totalFat;
    private double saturatedFat;
    private double transFat;
    private double dietaryFiber;
    private double sodium;


    /**
     * @param name
     * @param calories
     * @param totalCarbohydrate
     * @param liquidCarbohydrate
     * @param protein
     * @param totalFat
     * @param saturatedFat
     * @param transFat
     * @param dietaryFiber
     * @param sodium
     */
    public Food(String name, double calories, double totalCarbohydrate, double liquidCarbohydrate, double protein,
            double totalFat, double saturatedFat, double transFat, double dietaryFiber, double sodium) {
        this.name = name;
        this.calories = calories;
        this.totalCarbohydrate = totalCarbohydrate;
        this.liquidCarbohydrate = liquidCarbohydrate;
        this.protein = protein;
        this.totalFat = totalFat;
        this.saturatedFat = saturatedFat;
        this.transFat = transFat;
        this.dietaryFiber = dietaryFiber;
        this.sodium = sodium;
    }

    Food() {}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getTotalCarbohydrate() {
        return totalCarbohydrate;
    }

    public void setTotalCarbohydrate(double totalCarbohydrate) {
        this.totalCarbohydrate = totalCarbohydrate;
    }

    public double getLiquidCarbohydrate() {
        return liquidCarbohydrate;
    }

    public void setLiquidCarbohydrate(double liquidCarbohydrate) {
        this.liquidCarbohydrate = liquidCarbohydrate;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(double totalFat) {
        this.totalFat = totalFat;
    }

    public double getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(double saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public double getTransFat() {
        return transFat;
    }

    public void setTransFat(double transFat) {
        this.transFat = transFat;
    }

    public double getDietaryFiber() {
        return dietaryFiber;
    }

    public void setDietaryFiber(double dietaryFiber) {
        this.dietaryFiber = dietaryFiber;
    }

    public double getSodium() {
        return sodium;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(calories);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalCarbohydrate);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(liquidCarbohydrate);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(protein);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalFat);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(saturatedFat);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(transFat);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dietaryFiber);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sodium);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Food other = (Food) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(calories) != Double.doubleToLongBits(other.calories))
            return false;
        if (Double.doubleToLongBits(totalCarbohydrate) != Double.doubleToLongBits(other.totalCarbohydrate))
            return false;
        if (Double.doubleToLongBits(liquidCarbohydrate) != Double.doubleToLongBits(other.liquidCarbohydrate))
            return false;
        if (Double.doubleToLongBits(protein) != Double.doubleToLongBits(other.protein))
            return false;
        if (Double.doubleToLongBits(totalFat) != Double.doubleToLongBits(other.totalFat))
            return false;
        if (Double.doubleToLongBits(saturatedFat) != Double.doubleToLongBits(other.saturatedFat))
            return false;
        if (Double.doubleToLongBits(transFat) != Double.doubleToLongBits(other.transFat))
            return false;
        if (Double.doubleToLongBits(dietaryFiber) != Double.doubleToLongBits(other.dietaryFiber))
            return false;
        if (Double.doubleToLongBits(sodium) != Double.doubleToLongBits(other.sodium))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Food [id=" + id + ", name=" + name + ", calories=" + calories + ", totalCarbohydrate="
                + totalCarbohydrate + ", liquidCarbohydrate=" + liquidCarbohydrate + ", protein=" + protein
                + ", totalFat=" + totalFat + ", saturatedFat=" + saturatedFat + ", transFat=" + transFat
                + ", dietaryFiber=" + dietaryFiber + ", sodium=" + sodium + "]";
    }

}
