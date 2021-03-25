package main;

public class Food {
    private String name;
    private int calories;

    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName(){
        return this.name;
    }

    public int getCalories(){
        return this.calories;
    }
    
}
