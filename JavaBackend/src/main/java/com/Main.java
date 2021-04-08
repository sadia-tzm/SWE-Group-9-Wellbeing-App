package com;

import com.firebaseStuff.FirebaseInitialise;

public class Main{
    public static void main(String[] args) {
        System.out.println("Running");
        FirebaseInitialise testFirebase = new FirebaseInitialise();
        User tempUser = new User("Ollie2", "123", "OlliesRealm", "olliepgannon@hotmail.com");
        testFirebase.initialize(tempUser);
    }
}