package main;

public class Food {
    private String name;
    private int caloriesPer100g;
    private int weight;

    public Food(String name, int calories, int weight) {
        this.name = name;
        this.caloriesPer100g = calories/weight/10;
        this.weight= weight;
    }

    public String getName(){
        return this.name;
    }

    public int getCalories(){
        return this.caloriesPer100g;
    }
    
}
