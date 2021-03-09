package main;

import java.time.LocalDateTime;

public class Calorie extends HealthProperty {

	private int calories;
	private String food;

	/**
	 * 
	 * @param ccalories
	 * @param ffood
	 * @param ddateLogged
	 */
	public boolean Calorie(int ccalories, String ffood, LocalDateTime ddateLogged) {
		// TODO - implement Calorie.Calorie
		throw new UnsupportedOperationException();
	}

	public int getCalories() {
		return this.calories;
	}

	public String getFood() {
		return this.food;
	}

	/**
	 * 
	 * @param newCalories
	 */
	public boolean setCalories(int newCalories) {
		// TODO - implement Calorie.setCalories
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newFood
	 */
	public boolean setFood(String newFood) {
		// TODO - implement Calorie.setFood
		throw new UnsupportedOperationException();
	}

}