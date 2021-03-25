package main;

public class Calorie extends HealthProperty {

	private int calories;
	private Food food;

	//need to calculate weight of food
	public Calorie(int calories, Food food) {
		this.calories = calories;
		this.food = food;
	}

	public Calorie(Food food) {
		this.calories = food.getCalories();
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

}