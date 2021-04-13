package com;

import com.firebaseStuff.FirebaseDatabase;

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
        while (true) {
            if (inventory.getCurrentTask() != null) {
                inventory.completeTask();
            }
            Thread.sleep(500);
        }
    }
}