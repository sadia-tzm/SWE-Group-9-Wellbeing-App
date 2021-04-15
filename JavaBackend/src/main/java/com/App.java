package com;

//This is for running the backend, initialising the internal data and then 
//constantly scanning the database for any communications 
//(food can't be stored on the database due to our limitations with the free version firestore)
public class App{
    public static void main(String[] args) throws InterruptedException {
        Inventory inventory = Inventory.getInstance();
        inventory.addManyFood();
        System.out.println("Initialised food objects");
        while (true) {
            if (inventory.getCurrentTask() != null) {
                inventory.completeTask();
            }
            Thread.sleep(500);
        }
    }
}