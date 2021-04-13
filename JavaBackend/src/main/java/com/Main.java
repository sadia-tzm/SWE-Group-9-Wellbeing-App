package com;

import com.firebaseStuff.FirebaseDatabase;
import com.google.cloud.firestore.DocumentSnapshot;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        Inventory inventory = Inventory.getInstance();
        FirebaseDatabase testFirebase = FirebaseDatabase.fbdbGetInstance();

        // FDMEmployee employee = new FDMEmployee("name", "password", 
        // "username", "email@e.mail", LocalDateTime.now(), 200, 100);
        // System.out.println("Running");
        // TimeUnit.SECONDS.sleep(1);
        // //---------------------------------set item
        // testFirebase.setItems("employees", employee.security.getUserName(), employee);
        // TimeUnit.SECONDS.sleep(1);
        // //---------------------------------get item
        // DocumentSnapshot document = testFirebase.getItems("employees", employee.security.getUserName());
        // FDMEmployee newEmployee = document.toObject(FDMEmployee.class);
        // newEmployee.viewStatistics();

        testFirebase.eventTrigger();
        while (inventory.getCurrentTask() == null){
            System.out.println("Current task: "+inventory.getCurrentTask());
            Thread.sleep(500);
        }
        //System.out.println("Can it trigger comments after?");

        
    }
}