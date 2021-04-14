package com;

public class Calorie extends HealthProperty {

	private int calories;
	private Food food;

	//need to calculate weight of food
	public Calorie(long id, Food food, double weightOfFood) {
		super(id);
		this.calories = food.calculateTotalCalories(weightOfFood);
		this.food = food;
	}

	public int getCalories() {
		return this.calories;
	}

	public Food getFood() {
		return this.food;
	}

	public void setCalories(int newCalories) {
		this.calories = newCalories;
	}

	public void setCalories(int newCalories, Food newfood) {
		this.calories = newCalories;
		this.food = newfood;
	}
	//----------------------------------------------------------------------------------------------------------------------------------------
	//firebase stuff!!

	public Calorie() {
		super(0);
	}
    
	public void setFood(Food food) {
		this.food = food;
	}

}