package main;

public class Food {
    private String name;
    private int caloriesPer100g;
    private int weight;

    public Food(String name, int calories, int weight) {
        this.name = name;
        this.weight = weight;
        this.caloriesPer100g = calories/10/this.weight;
    }

    public String getName(){
        return this.name;
    }

    public int getCalories(){
        return this.caloriesPer100g;
    }
    
    public int calculateTotalCalories(int weight){
        return caloriesPer100g * 10 * weight;
    }
}
