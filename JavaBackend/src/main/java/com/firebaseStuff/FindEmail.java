package com.firebaseStuff;

//basic class to facilitate built-in firebase code when converting documents to objects
public class FindEmail {
    boolean start;
    String username;

    public boolean getStart() {
        return this.start;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setStart(boolean start) {
        this.start = start;
    }
}
