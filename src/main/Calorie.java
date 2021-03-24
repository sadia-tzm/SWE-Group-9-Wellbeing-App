package main;

import java.time.LocalDateTime;

public class Calorie extends HealthProperty {

	private int calories;
	private Food food;

	public Calorie(LocalDateTime ddateLogged, int ccalories, Food ffood) {
		super(ddateLogged);
		calories = ccalories;
		food = ffood;
	}

	public Calorie(LocalDateTime ddateLogged, Food ffood) {
		super(ddateLogged);
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