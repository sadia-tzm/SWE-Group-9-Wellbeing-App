package com;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.*;

public class AliTest {

    private FDMEmployee employee;

    @BeforeEach
    public void setUp() throws Exception {
        employee = new FDMEmployee("name", "password", "username", "email@e.mail", LocalDateTime.now(), 200, 100);
    }

    @Test
    @DisplayName("Delete Entry Test")
    public void testDeleteEntry() {
        //Weight
        employee.health.logWeight(120);
        assertTrue(employee.health.checkEntry(employee.health.getCurrentWeight()));
        Weight w = employee.health.getCurrentWeight();
        employee.health.deleteWeightEntry(employee.health.getCurrentWeight());
        assertFalse(employee.health.checkEntry(w));

        //Height
        employee.health.logHeight(203);
        assertTrue(employee.health.checkEntry(employee.health.getCurrentHeight()));
        Height h = employee.health.getCurrentHeight();
        employee.health.deleteHeightEntry(employee.health.getCurrentHeight());
        assertFalse(employee.health.checkEntry(h));


        //Calorie
        employee.health.logCalories(new Food("Apple", 300, 0.3), 0.3);
        Calorie c = employee.health.getCalorieHistory().get(employee.health.getCalorieHistory().size()-1);
        assertTrue(employee.health.checkEntry(c));
        employee.health.deleteCalorieEntry(c);
        assertFalse(employee.health.checkEntry(c));
    }

    @Test
    @DisplayName("Edit Entry Test") 
    public void testEditEntry(){
        //Weight
        int w = employee.health.getCurrentWeight().getWeight();
        employee.health.editWeightEntry(employee.health.getCurrentWeight(), 96);;
        assertFalse(w==employee.health.getCurrentWeight().getWeight());

        //Height
        int h = employee.health.getCurrentHeight().getHeight();
        employee.health.editHeightEntry(employee.health.getCurrentHeight(), 190);
        assertFalse(h == employee.health.getCurrentHeight().getHeight());
        
        //Calorie
        employee.health.logCalories(new Food("Apple", 300, 0.3), 0.3);
        int c = employee.health.getLastCalorieEntry().getCalories();
        employee.health.editCalorieEntry(employee.health.getLastCalorieEntry(), 100);
        assertFalse(c == employee.health.getLastCalorieEntry().getCalories());

        //Calorie Otherway
        employee.health.logCalories(new Food("Aple", 300, 0.3), 0.3);
        Food f = new Food("Apple",300,0.3);
        String name = employee.health.getLastCalorieEntry().getFood().getName();
        employee.health.editCalorieEntry(employee.health.getLastCalorieEntry(), 300, f);
        assertFalse(name.equals(employee.health.getLastCalorieEntry().getFood().getName()));
    }

}
