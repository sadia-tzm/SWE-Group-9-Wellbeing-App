package main;

public class Food {
    private String name;
    private int calories;

    public Food(String nname, int ccalories) {
        name = nname;
        calories = ccalories;
    }

    public String getName(){
        return this.name;
    }

    public int getCalories(){
        return this.calories;
    }
    
}
