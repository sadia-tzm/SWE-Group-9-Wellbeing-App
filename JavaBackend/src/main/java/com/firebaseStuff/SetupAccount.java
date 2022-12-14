package com.firebaseStuff;

//basic class to facilitate built-in firebase code when converting documents to objects
public class SetupAccount {
    private boolean start;
    private String email;
    private String username;
    private int height;
    private int weight;
    private String dob;
    private String name;

    public boolean getStart() {
        return this.start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
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


    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
