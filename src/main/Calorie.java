package main;

public class Calorie extends HealthProperty {

	private int calories;
	private Food food;

	public Calorie(int ccalories, Food ffood) {
		calories = ccalories;
		food = ffood;
	}

	public Calorie(Food ffood) {
		calories = ffood.getCalories();
		food = ffood;
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