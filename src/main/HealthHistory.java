package main;
import java.util.*;

public class HealthHistory {

	private List<Weight> weightHistory;
	private List<Height> heightHistory;
	private List<Calorie> calorieHistory;

	public HealthHistory(Height height, Weight weight) {
		weightHistory = new ArrayList<Weight>();
		heightHistory = new ArrayList<Height>();
		calorieHistory = new ArrayList<Calorie>();
		intialWeight(height, weight);
	}

	private void intialWeight(Height height, Weight weight) {
		heightHistory.add(height);
		weightHistory.add(weight);
	}

	public void logCalories(Calorie calories) {
		calorieHistory.add(calories);
	}

	public void logHeight(Height height) {
		heightHistory.add(height);
	}

	public void logWeight(Weight weight) {
		weightHistory.add(weight);
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