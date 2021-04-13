package com;

import java.lang.Math.*;

public class Food {
    private String name;
    private int caloriesPer100g;
    private double weight;
    /**
    * weight in grams
    */
    public Food(String name, int calories, double weight) {
        this.name = name;
        this.weight = weight;
        this.caloriesPer100g = (int)(((double)calories/this.weight)*100.0);
    }

    public String getName(){
        return this.name;
    }

    public int getCalories(){
        return this.caloriesPer100g;
    }
    /**
     * calculates the calories for a food given its weight, and using the relative calories per 100grams
     * @param w
     * @return
     */
    public int calculateTotalCalories(double w){

        return (int) Math.ceil((((double)this.caloriesPer100g/(double)100) * w));
    }

    //----------------------------------------------------------------------------------------------------------------------------------------
	//firebase stuff!!

    public Food() {
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCaloriesPer100g() {
        return this.caloriesPer100g;
    }

    public void setCaloriesPer100g(int caloriesPer100g) {
        this.caloriesPer100g = caloriesPer100g;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
