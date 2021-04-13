package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
//import java.util.*;
import java.time.*;

/**
 * 
 * @author Shannon
 */
public class TestSet1 {

    private FDMEmployee employee;
    private Food apple;

    @BeforeEach
    public void setUp() throws Exception {
        employee = new FDMEmployee("name", "username", "email@e.mail", "123", LocalDateTime.now(), 200, 100);

    }

    @Test
    @DisplayName("Getters Test")
    public void testGetters() {
        assertEquals("name", employee.getName());
        assertEquals("username", employee.getUserName());
        assertEquals("123", employee.getId());

    }

    @Nested
    @DisplayName("Security Based Tests")
    class SecTest {

        @Test
        @DisplayName("Security Test - creation of security class/variables")
        void secTestClassCreation() {
            assertEquals("username", employee.getUserName());
            assertEquals("email@e.mail", employee.getEmail());

        }
        
        // @Test
        // @DisplayName("Security Test - wrong password")
        // void secTestWrongPw() {

        //     employee.logout();
        //     employee.login("username", "wrongpassword");
        //     assertFalse(employee.isUnlocked(), "checks if logged in when wrong password only entered");
        // }

        // @Test
        // @DisplayName("Security Test - wrong username")
        // void secTestWrongUn() {
        //     employee.logout();
        //     employee.login("wrongusername", "password");
        //     assertFalse(employee.isUnlocked(), "checks if logged in when wrong username entered");
        // }

        // @Test
        // @DisplayName("Security Test - wrong credentials")
        // void secTestWrongUnPw() {
        //     employee.logout();
        //     employee.login("wrongusername", "wrongpassword");
        //     assertFalse(employee.isUnlocked(),
        //             "checks if logged in when wrong username and password entered");
        // }

    //     @Test
    //     @DisplayName("Security Test - correct credentials")
    //     void secTestRightUnPw() {
    //         employee.logout();
    //         employee.login("username", "password");
    //         assertTrue(employee.isUnlocked(), "checks if logged in when correct credentials entered");
    //     }

    //     @Test
    //     @DisplayName("Security Test - not case sensitive username")
    //     void secTestCaseUn() {
    //         employee.logout();
    //         employee.login("USERNAME", "password");
    //         assertFalse(employee.isUnlocked(), "checks if logged in when wrong username entered(case)");
    //     }

    //     @Test
    //     @DisplayName("Security Test - case sensitive email")
    //     void secTestCaseEmail() {
    //         employee.logout();
    //         employee.login("EMAIL@E.MAIL", "password");
    //         assertTrue(employee.isUnlocked(), "checks if logged in when correct credentials entered");
    //     }

    //     @Test
    //     @DisplayName("Security Test - case sensitive email")
    //     void secTestCaseEmailcase() {
    //         employee.logout();
    //         employee.login("email@e.mail", "password");
    //         assertTrue(employee.isUnlocked(), "checks if logged in when correct credentials entered");
    //     }
    }

    @Nested
    @DisplayName("Health History Tests")
    class HealthHist {

        @BeforeEach
        void beforeEach() {
            employee = new FDMEmployee("name", "password", "username", "email@e.mail", LocalDateTime.now(), 200, 100);
            apple = new Food("Apple", 95, 155.0);

        }

        @Test
        @DisplayName("Health History Test - creation of class")
        void helTestClassCreation() {
            assertTrue(employee.getHealthHistory() instanceof HealthHistory);// checks that class is created correctly.
        }

        @Test
        @DisplayName("Health History Test - bmi calc")
        void helTestBMI() {//check BMI calculated correctly and right textual description returned. 
            assertEquals(25.0, employee.getHealthHistory().getCurrentBMI());
            assertEquals("Overweight",
                    employee.getHealthHistory().getCurrentBMIStatus(employee.getHealthHistory().getCurrentBMI()));
        }

        @Test
        @DisplayName("Health History Test - logging a new weight")
        void helTestlogWeight() {
            employee.getHealthHistory().logWeight(99);//enter a new weight
            assertEquals(24.8, employee.getHealthHistory().getCurrentBMI());//checks BMI has changed
            assertEquals(99, employee.getHealthHistory().getWeightHistory()
                    .get(employee.getHealthHistory().getWeightHistory().size() - 1).getWeight());//checks logged value is in the array 

        }

        @Test
        @DisplayName("Health History Test - logging a new height")
        void helTestlogHeight() {
            employee.getHealthHistory().logHeight(201);//enter a new height
            assertEquals(24.8, employee.getHealthHistory().getCurrentBMI());//checks BMI changed
            assertEquals(201, employee.getHealthHistory().getHeightHistory()
                    .get(employee.getHealthHistory().getHeightHistory().size() - 1).getHeight());//checks logged height is acutally entered

        }

        @Test
        @DisplayName("Health History Test - logging calorie entries")
        void helTestlogCal() {
            employee.getHealthHistory().logCalories(100, "Peanut Butter", 50);//creating new custom food and logging calories from there

            assertEquals("Peanut Butter", employee.getHealthHistory().getFoodHistory().get(0).getName());
            assertEquals(200, employee.getHealthHistory().getFoodHistory().get(0).getCalories());
            assertEquals(100, employee.getHealthHistory().getCalorieHistory().get(0).getCalories());

            
            employee.getHealthHistory().logCalories(apple, 150);//logging from existing food class
            employee.getHealthHistory().logCalories(apple, 145);

            assertEquals("Apple", employee.getHealthHistory().getCalorieHistory().get(1).getFood().getName());
            assertEquals("Apple", employee.getHealthHistory().getCalorieHistory().get(2).getFood().getName());
            assertEquals(92, employee.getHealthHistory().getCalorieHistory().get(1).getCalories());
            assertEquals(89, employee.getHealthHistory().getCalorieHistory().get(2).getCalories());
        }

    }

}