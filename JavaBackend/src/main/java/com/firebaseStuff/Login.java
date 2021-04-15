package com.firebaseStuff;

//basic class to facilitate built-in firebase code when converting documents to objects
public class Login {
    boolean start;
    String email;

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
}