package com;

import java.util.*;

//class HealthHistory contains the historical health data of FDMEmployee
public class HealthHistory {

	private ArrayList<Weight> weightHistory;
	private ArrayList<Height> heightHistory;
	private ArrayList<Calorie> calorieHistory;
	private ArrayList<Food> foodHistory;
	private ArrayList<Double> bmiHistory;

	public HealthHistory(int height, int weight) {
		weightHistory = new ArrayList<Weight>();
		heightHistory = new ArrayList<Height>();
		calorieHistory = new ArrayList<Calorie>();
		bmiHistory = new ArrayList<Double>();
		foodHistory = new ArrayList<Food>();
		intialWeight(height, weight);
		setBMI();
	}
	/**
	 * add initial height and weight specified in constructor to the corresponding arraylists
	 * @param height
	 * @param weight
	 */
	private void intialWeight(int height, int weight) {
		heightHistory.add(new Height(0, height));
		weightHistory.add(new Weight(0, weight));
	}

	/**
	 * logs calories based on a custome netered food.
	 * @param calories
	 * @param nameOfFood
	 * @param weightOfFood
	 */
	public void logCalories(int calories, String nameOfFood, int weightOfFood) {
		Food foodItem = new Food(nameOfFood, calories, weightOfFood);
		// System.out.println(foodItem.getCalories());
		foodHistory.add(foodItem);
		int size = calorieHistory.size();
		long id = (size != 0) ? calorieHistory.get(size-1).getId()+1 : 0;
		calorieHistory.add(new Calorie(id, foodItem, weightOfFood));
	}
	/**
	 * logs calories for an already predetermied food object.
	 * @param food
	 * @param weight
	 */
	public void logCalories(Food food, double weight) {
		int size = calorieHistory.size();
		long id = (size != 0) ? calorieHistory.get(size-1).getId()+1 : 0;
		System.out.println(id);
		calorieHistory.add(new Calorie(id, food, weight));
	}

	public void logNewFood(int calories, String nameOfFood, int weightOfFood) {
		Food foodItem = new Food(nameOfFood, calories, weightOfFood);
		foodHistory.add(foodItem);
	}
	/**
	 * calculates BMI for for most recently entered height and weight. 
	 */
	public void setBMI() {
		double weight = (double) weightHistory.get(weightHistory.size() - 1).getWeight();
		double height = (double) heightHistory.get(heightHistory.size() - 1).getHeight() / 100;
		double b = (double) Math.round((weight / (height * height)) * 10.0) / 10.0;
		bmiHistory.add(b);
	}
	/**
	 * 
	 * @return the most recent BMI fro the history array
	 */
	public double getCurrentBMI() {
		return bmiHistory.get(bmiHistory.size() - 1);
	}

	// more nuances to BMI????
	/*
	 * 
	 * @param BMI the value for bmi
	 * @return the textural meaningc/ representation for the bmi
	*/
	public String getCurrentBMIStatus(double BMI) {
		if (BMI < 18.5) {
			return "Underweight";
		} else if ((BMI) >= 18.5 && (BMI) < 25) {
			System.out.println("between 18.5 and 24.9");
			return "Normal";
		} else if (BMI >= 25.0 && BMI < 30) {
			System.out.println("between 25 and 29.9");
			return "Overweight";
		} else {
			System.out.println("greater than 30");
			return "Obese";
		}
	}

	/**
	 * adds new height to height array
	 * @param height
	 */
	public void logHeight(int height) {
		int size = heightHistory.size();
		long id = (size != 0) ? heightHistory.get(size-1).getId()+1 : 0;
		heightHistory.add(new Height(id, height));
		this.setBMI();

	}
	/**
	 * adds new weight to wight array
	 * @param weight
	 */
	public void logWeight(int weight) {
		int size = weightHistory.size();
		long id = (size != 0) ? weightHistory.get(size-1).getId()+1 : 0;
		weightHistory.add(new Weight(id, weight));
		this.setBMI();
	}

	public void logHeightAndWeight(int height, int weight) {
		this.logHeight(height);
		this.logWeight(weight);
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

	public List<Food> getFoodHistory() {
		return this.foodHistory;
	}

	public Height getCurrentHeight() {
		if (heightHistory.size() == 0) return null;
		return heightHistory.get(heightHistory.size() - 1);
	}

	public Weight getCurrentWeight() {
		if (weightHistory.size() == 0) return null;
		return weightHistory.get(weightHistory.size() - 1);
	}

	public Calorie getLastCalorieEntry(){
		if (calorieHistory.size() == 0) return null;
		return calorieHistory.get(this.calorieHistory.size()-1);
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
	
	public void editWeightEntry(Weight w, int amount) {
		w.setWeight(amount);
	}

	public void editHeightEntry(Height w, int amount) {
		w.setHeight(amount);
	}

	public void editCalorieEntry(Calorie w, int amount) {
		w.setCalories(amount);
	}

	public void editCalorieEntry(Calorie w, int amount, Food f) {
		w.setCalories(amount, f);
	}

	public void editFoodEntry(String s, Food f) {
	}

	public boolean checkEntry(Weight w) {
		return weightHistory.contains(w);
	}

	public boolean checkEntry(Height h) {
		return heightHistory.contains(h);
	}

	public boolean checkEntry(Calorie c) {
		return calorieHistory.contains(c);
	}

	public boolean checkEntry(Food f) {
		return foodHistory.contains(f);
	}

	public boolean checkEntry(Double b) {
		return bmiHistory.contains(b);
	}

	public Food findFood(String name) {
		for(Food food : foodHistory) {
			if (food.getName() == name) return food;
		}
		return null;
	}

	public Weight findWeight(int id) {
		for(Weight weight : weightHistory) {
			if (weight.getId() == id) return weight;
		}
		return null;
	}

	public Height findHeight(int id) {
		for(Height height : heightHistory) {
			if (height.getId() == id) return height;
		}
		return null;
	}

	public Calorie findCalorie(int id) {
		for(Calorie calorie : calorieHistory) {
			if (calorie.getId() == id) return calorie;
		}
		return null;
	}

	//----------------------------------------------------------------------------------------------------------------------------------------
	//firebase stuff!!

	public HealthHistory() {}//empty constructor for firebase

	//basic getters and setters for those that don't have them
	public void setWeightHistory(ArrayList<Weight> weightHistory) {
		this.weightHistory = weightHistory;
	}
	public void setHeightHistory(ArrayList<Height> heightHistory) {
		this.heightHistory = heightHistory;
	}
	public void setCalorieHistory(ArrayList<Calorie> calorieHistory) {
		this.calorieHistory = calorieHistory;
	}

	public void setFoodHistory(ArrayList<Food> foodHistory) {
		this.foodHistory = foodHistory;
	}

	public ArrayList<Double> getBmiHistory() {
		return this.bmiHistory;
	}

	public void setBmiHistory(ArrayList<Double> bmiHistory) {
		this.bmiHistory = bmiHistory;
	}

	//----------------------------------------------------------------------------------------------------------------------------------------

}