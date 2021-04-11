package com;

import com.firebaseStuff.FirebaseDatabase;

public class Main{
    public static void main(String[] args) {
        System.out.println("Running");
        FirebaseDatabase testFirebase = new FirebaseDatabase();
        User tempUser = new User("testUser10", "123", "testUsername", "email@mail.com");
        testFirebase.initialize();
        testFirebase.setItems(tempUser, tempUser.getName(), "users");

    }
}