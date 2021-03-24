package main;

public class Calorie extends HealthProperty {

	private int calories;

	public Calorie(int ccalories) {
		calories = ccalories;
	}

	public int getCalories() {
		return this.calories;
	}

	public void setCalories(int newCalories) {
		this.calories = newCalories;
	}

}