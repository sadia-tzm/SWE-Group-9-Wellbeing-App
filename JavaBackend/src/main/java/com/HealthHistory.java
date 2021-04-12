package com;
import java.util.*;

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
		intialWeight(height, weight);
		setBMI();
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
		
		double weight = (double)weightHistory.get(weightHistory.size()-1).getWeight();
		//System.out.println(weight);
		double  height = (double)heightHistory.get(heightHistory.size()-1).getHeight()/100;
		//System.out.println(height);
		double b = (double)Math.round((weight/(height*height)) * 10.0) / 10.0;


		//b = b / 10.0;
		//System.out.println("final - "+b);
		//System.out.println(b);
		bmiHistory.add(b);
		//System.out.println(this.bmiHistory.get(0));
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
		this.setBMI();
		
	}

	public void logWeight(int weight) {
		weightHistory.add(new Weight(weight));
		this.setBMI();
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

	public ArrayList<Food> getFoodHistory() {
		return this.foodHistory;
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