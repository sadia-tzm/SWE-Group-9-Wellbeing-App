package com;

public class Main{
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