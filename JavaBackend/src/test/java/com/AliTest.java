package com;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.*;
import java.util.ArrayList;

public class AliTest {

    private FDMEmployee employee;

    @BeforeEach
    public void setUp() throws Exception {
        employee = new FDMEmployee("name", "username", "email@e.mail", LocalDateTime.now(), 200, 100);
    }

    @Test
    @DisplayName("Delete Weight Entry Test")
    public void testDeleteWeightEntry() {
        employee.getHealthHistory().logWeight(120);
        assertTrue(employee.getHealthHistory().checkEntry(employee.getHealthHistory().getCurrentWeight()));
        Weight w = employee.getHealthHistory().getCurrentWeight();
        employee.getHealthHistory().deleteWeightEntry(employee.getHealthHistory().getCurrentWeight());
        assertFalse(employee.getHealthHistory().checkEntry(w));
    }

    @Test
    @DisplayName("Delete Height Entry Test")

    public void testDeleteHeightEntry(){
        employee.getHealthHistory().logHeight(203);
        assertTrue(employee.getHealthHistory().checkEntry(employee.getHealthHistory().getCurrentHeight()));
        Height h = employee.getHealthHistory().getCurrentHeight();
        employee.getHealthHistory().deleteHeightEntry(employee.getHealthHistory().getCurrentHeight());
        assertFalse(employee.getHealthHistory().checkEntry(h));
    }

    
    @Test
    @DisplayName("Delete Calorie Entry Test")

    public void testDeleteCalorieEntry(){
        employee.getHealthHistory().logCalories(new Food("Apple", 300, 0.3), 0.3);
        Calorie c = employee.getHealthHistory().getCalorieHistory().get(employee.getHealthHistory().getCalorieHistory().size()-1);
        assertTrue(employee.getHealthHistory().checkEntry(c));
        employee.getHealthHistory().deleteCalorieEntry(c);
        assertFalse(employee.getHealthHistory().checkEntry(c));
    }

    @Test
    @DisplayName("Edit Weight Entry Test") 
    public void testWeightEditEntry(){
        int w = employee.getHealthHistory().getCurrentWeight().getWeight();
        employee.getHealthHistory().editWeightEntry(employee.getHealthHistory().getCurrentWeight(), 96);;
        assertFalse(w==employee.getHealthHistory().getCurrentWeight().getWeight());
    }

    
    @Test
    @DisplayName("Edit Height Entry Test") 
    public void testHeightEditEntry(){
        int h = employee.getHealthHistory().getCurrentHeight().getHeight();
        employee.getHealthHistory().editHeightEntry(employee.getHealthHistory().getCurrentHeight(), 190);
        assertFalse(h == employee.getHealthHistory().getCurrentHeight().getHeight());
    }

    @Test
    @DisplayName("Edit Calorie Entry Test") 
    public void testCalorieEditEntry(){
        employee.getHealthHistory().logCalories(new Food("Apple", 300, 0.3), 0.3);
        int c = employee.getHealthHistory().getLastCalorieEntry().getCalories();
        employee.getHealthHistory().editCalorieEntry(employee.getHealthHistory().getLastCalorieEntry(), 100);
        assertFalse(c == employee.getHealthHistory().getLastCalorieEntry().getCalories());
    }

    @Test
    @DisplayName("Edit Other Calorie Entry Test") 
    public void testOtherCalorieEditEntry(){
        employee.getHealthHistory().logCalories(new Food("Aple", 300, 0.3), 0.3);
        Food f = new Food("Apple",300,0.3);
        String name = employee.getHealthHistory().getLastCalorieEntry().getFood().getName();
        employee.getHealthHistory().editCalorieEntry(employee.getHealthHistory().getLastCalorieEntry(), 300, f);
        assertFalse(name.equals(employee.getHealthHistory().getLastCalorieEntry().getFood().getName()));
    }

    @Test
    @DisplayName("Search Food")
    public void testSearchFood() throws InterruptedException{
        Inventory inventory = Inventory.getInstance();
        inventory.addManyFood();
        System.out.println("Initialised food objects");
        //assertFalse((inventory.searchFood("Canned Grapes")).equals(null));
    }

    @Test
    @DisplayName("Searchable Suggestion Food")
    public void testSearchableFoodSuggestion() throws InterruptedException{
        Inventory inventory = Inventory.getInstance();
        inventory.addManyFood();
        System.out.println("Initialised food objects");
        ArrayList<Food> a = inventory.searchFoodSuggestor("ap");
        System.out.println(a);
        assertTrue(a.size()>1);
    }
}
