package com.firebaseStuff;


//basic class to facilitate built-in firebase code when converting documents to objects
public class AddCalories {
    boolean start;
    String food;
    int weight;
    int calories;
    String date;

    public AddCalories() {
    }

    public boolean getStart() {
        return this.start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public String getFood() {
        return this.food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return this.calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
