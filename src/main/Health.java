package main;
import java.time.LocalDateTime;
import java.util.*;

public class Health {

	private List<Weight> weightHistory;
	private List<Height> heightHistory;
	private List<Calorie> calorieHistory;
	private LocalDateTime recentDateLogged;

	public void Health(Height height, Weight weight) {
		heightHistory.add(height);
		weightHistory.add(weight);
	}

	//Food may be not required!
	public void logCalories(Calorie calories, int food) {
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
	// Pretty complex - requires additional paramaters such as age height and gender
	public int getBMI() {
		// TODO - implement Health.getBMI
		throw new UnsupportedOperationException();
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