package main;
import java.time.LocalDateTime;
import java.util.*;

public class Health {

	private List<Weight> weightHistory;
	private List<Height> heightHistory;
	private List<Calorie> calorieHistory;
	private LocalDateTime recentDateLogged;

	/**
	 * 
	 * @param height
	 * @param weight
	 */
	public void Health(Height height, Weight weight) {
		this.weightHistory = new List<Weight>();


	}

	/**
	 * 
	 * @param calories
	 * @param food
	 */
	public void logCalories(int calories, int food) {
		// TODO - implement Health.logCalories
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param height
	 */
	public void logHeight(int height) {
		// TODO - implement Health.logHeight
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param weight
	 */
	public void logWeight(int weight) {
		// TODO - implement Health.logWeight
		throw new UnsupportedOperationException();
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
		// TODO - implement Health.getCurrentHeight
		throw new UnsupportedOperationException();
	}

	public Weight getCurrentWeight() {
		// TODO - implement Health.getCurrentWeight
		throw new UnsupportedOperationException();
	}

	public int getBMI() {
		// TODO - implement Health.getBMI
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param calorieEntry
	 */
	public boolean deleteCalorieEntry(Calorie calorieEntry) {
		// TODO - implement Health.deleteCalorieEntry
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param heightEntry
	 */
	public boolean deleteHeightEntry(Height heightEntry) {
		// TODO - implement Health.deleteHeightEntry
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param weightEntry
	 */
	public boolean deleteWeightEntry(Weight weightEntry) {
		// TODO - implement Health.deleteWeightEntry
		throw new UnsupportedOperationException();
	}

}