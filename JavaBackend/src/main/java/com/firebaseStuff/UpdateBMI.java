package com.firebaseStuff;

//basic class to facilitate built-in firebase code when converting documents to objects
public class UpdateBMI {
    boolean start;
    int height;
    int weight;

    public boolean getStart() {
        return this.start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }      
}
