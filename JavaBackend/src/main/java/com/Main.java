package com;

import com.firebaseStuff.FirebaseDatabase;
import com.google.cloud.firestore.DocumentSnapshot;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        FDMEmployee employee = new FDMEmployee("name", "password", "username", "email@e.mail", LocalDateTime.now(), 200, 100);
        System.out.println("Running");
        FirebaseDatabase testFirebase = FirebaseDatabase.fbdbGetInstance();
        TimeUnit.SECONDS.sleep(1);
        //---------------------------------set item
        testFirebase.setItems("employees", employee.security.getUserName(), employee);
        TimeUnit.SECONDS.sleep(1);
        //---------------------------------get item
        DocumentSnapshot document = testFirebase.getItems("employees", employee.security.getUserName());
        FDMEmployee newEmployee = document.toObject(FDMEmployee.class);
        System.out.println(newEmployee.viewStatistics());
        TimeUnit.SECONDS.sleep(5);
        //---------------------------------delete item
        testFirebase.deleteItems("users", "newTest");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("Running");
        // User tempUser = new User("testUser11", "123", "testUsername", "email@mail.com");
        // TimeUnit.SECONDS.sleep(1);
        // //---------------------------------set item
        // testFirebase.setItems("users", tempUser.getName(), tempUser);
        // TimeUnit.SECONDS.sleep(1);
        // //---------------------------------get item
        // DocumentSnapshot document2 = testFirebase.getItems("users", "testUser11");
        // User newUser = document2.toObject(User.class);
        // TimeUnit.SECONDS.sleep(1);
        // // //---------------------------------delete item
        // testFirebase.deleteItems("users", "testUser11");
        // TimeUnit.SECONDS.sleep(1);
    }
}