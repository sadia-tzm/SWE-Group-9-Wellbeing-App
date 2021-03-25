package main;
import java.util.*;

public class HealthHistory {

	private List<Weight> weightHistory;
	private List<Height> heightHistory;
	private List<Calorie> calorieHistory;

	public HealthHistory(int height, int weight) {
		weightHistory = new ArrayList<Weight>();
		heightHistory = new ArrayList<Height>();
		calorieHistory = new ArrayList<Calorie>();
		intialWeight(height, weight);
	}

	private void intialWeight(int height, int weight) {
		heightHistory.add(new Height(height));
		heightHistory.add(new Height(height));
	}

	public void logCalories(int calories, String nameOfFood, int weightOfFood) {
		calorieHistory.add(new Calorie(calories, new Food(nameOfFood, calories, weightOfFood)));
	}

	public void logCalories(Food food, int weightOfFood) {
		calorieHistory.add(new Calorie(food, weightOfFood));
	}

	public void logHeight(int height) {
		heightHistory.add(new Height(height));
	}

	public void logWeight(int weight) {
		weightHistory.add(new Weight(weight));
	}

	public List<Calorie> getCalorieHistory() {
		return this.calorieHistory;
	}

	public List<Height> getHeightHistory() {
		return this.heightHistory;

	}

	public List<Weight> getWeightHistory() {
		return this.weightHistory;
	}

	public Height getCurrentHeight() {
		return heightHistory.get(heightHistory.size()-1);
	}

	public Weight getCurrentWeight() {
		return weightHistory.get(weightHistory.size()-1);
	}

	public void deleteCalorieEntry(Calorie calorieEntry) {
		calorieHistory.remove(calorieEntry);
	}

	public void deleteHeightEntry(Height heightEntry) {
		heightHistory.remove(heightEntry);
	}

	public void deleteWeightEntry(Weight weightEntry) {
		weightHistory.remove(weightEntry);
	}

}