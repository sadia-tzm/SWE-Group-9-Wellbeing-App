package com;

import com.firebaseStuff.FirebaseDatabase;
import com.google.cloud.firestore.DocumentSnapshot;
import java.util.concurrent.TimeUnit;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Running");
        FirebaseDatabase testFirebase = FirebaseDatabase.fbdbGetInstance();
        User tempUser = new User("testUser11", "123", "testUsername", "email@mail.com");
        TimeUnit.SECONDS.sleep(1);
        //---------------------------------set item
        testFirebase.setItems("users", tempUser.getName(), tempUser);
        TimeUnit.SECONDS.sleep(1);
        //---------------------------------get item
        DocumentSnapshot document = testFirebase.getItems("users", "testGuy2");
        User newUser = document.toObject(User.class);
        TimeUnit.SECONDS.sleep(1);
        //---------------------------------delete item
        testFirebase.deleteItems("users", "newTest");
        TimeUnit.SECONDS.sleep(1);
        //---------------------------------set another item
        testFirebase.setItems("users", "newTest", newUser);
    }
}