package com;

public class Calorie extends HealthProperty {

	private int calories;
	private Food food;

	//need to calculate weight of food
	public Calorie(Food food, double weightOfFood) {
		this.calories = food.calculateTotalCalories(weightOfFood);
		this.food = food;
	}

	public int getCalories() {
		return this.calories;
	}

	public Food getFood() {
		return this.food;
	}

	public void setCalories(int newCalories, Food newfood) {
		this.calories = newCalories;
		this.food = newfood;
	}

	public void setCalories(int newCalories) {
		this.calories = newCalories;
	}

}