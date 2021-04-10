package com;
import java.util.*;

public class HealthHistory {

	private List<Weight> weightHistory;
	private List<Height> heightHistory;
	private List<Calorie> calorieHistory;
	private List<Food> foodHistory;
	private List<Double> bmiHistory;

	public HealthHistory(int height, int weight) {
		weightHistory = new ArrayList<Weight>();
		heightHistory = new ArrayList<Height>();
		calorieHistory = new ArrayList<Calorie>();
		bmiHistory = new ArrayList<Double>();
		intialWeight(height, weight);
	}

	private void intialWeight(int height, int weight) {
		heightHistory.add(new Height(height));
		weightHistory.add(new Weight(weight));
	}

	public void logCalories(int calories, String nameOfFood, double weightOfFood) {
		Food foodItem = new Food(nameOfFood, calories, weightOfFood);
		foodHistory.add(foodItem);
		calorieHistory.add(new Calorie(foodItem, weightOfFood));
	}

	public void setBMI() {
		heightHistory.get(heightHistory.size()-1);
		double b = Math.round(((weightHistory.get(weightHistory.size()-1).getWeight()/(heightHistory.get(heightHistory.size()-1).getHeight() * heightHistory.get(heightHistory.size()-1).getHeight())*10)/10.0));
		bmiHistory.add(b);
		 //kg /h2
	}

	public double getCurrentBMI(){
		return bmiHistory.get(bmiHistory.size()-1);
	}

	//more nuances to BMI????
	public String getCurrentBMIStatus(double BMI){
		if (BMI < 18.5) {
            return "Underweight";
        } else if ((BMI) >= 18.5 || (BMI) <= 24.9) {
            System.out.println("between 18.5 and 24.9");
            return "Normal";
        } else if (BMI >= 25 || BMI <= 29.9) {
            System.out.println("between 25 and 29.9");
            return "Overweight";
        } else {
            System.out.println("greater than 30");
            return "Obese";
        }
	}

	public void logCalories(Food food, double d) {
		calorieHistory.add(new Calorie(food, d));
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

	public void editWeightEntry(Weight w, int amount){
		w.setWeight(amount);
	}

	public void editHeightEntry(Height w, int amount){
		w.setHeight(amount);
	}

	public void editCalorieEntry(Calorie w, int amount){
		w.setCalories(amount);
	}

	public void editCalorieEntry(Calorie w, int amount, Food f){
		w.setCalories(amount, f);
	}

	public void editFoodEntry(String s, Food f){
	}

	public boolean checkEntry(Weight w){
		return weightHistory.contains(w);
	}

	public boolean checkEntry(Height h){
		return heightHistory.contains(h);
	}

	public boolean checkEntry(Calorie c){
		return calorieHistory.contains(c);
	}

	public boolean checkEntry(Food f){
		return foodHistory.contains(f);
	}

	public boolean checkEntry(Double b){
		return bmiHistory.contains(b);
	}
}