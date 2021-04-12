package com;

public class Food {
    private String name;
    private double caloriesPer100g;
    private double weight;

    public Food(String name, int calories, double weight) {
        this.name = name;
        this.weight = weight;
        this.caloriesPer100g = Double.valueOf(calories)/10/this.weight;
    }

    public String getName(){
        return this.name;
    }

    public double getCalories(){
        return this.caloriesPer100g;
    }
    
    public int calculateTotalCalories(double weight){
        return (int)(caloriesPer100g * 10 * weight);
    }

    //----------------------------------------------------------------------------------------------------------------------------------------
	//firebase stuff!!

    public Food() {
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getCaloriesPer100g() {
        return this.caloriesPer100g;
    }

    public void setCaloriesPer100g(double caloriesPer100g) {
        this.caloriesPer100g = caloriesPer100g;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
