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

    @BeforeEach
    public void setUp() throws Exception {
        employee = new FDMEmployee("name", "password", "username", "email@e.mail", LocalDateTime.now(), 200, 100);

    }

    @Test
    @DisplayName("Getters Test")
    public void testGetters() {
        assertEquals("name", employee.getName());
        assertEquals("username", employee.security.getUserName());

    }

    @Nested
    @DisplayName("Security Based Tests")
    class SecTest {

        // @BeforeEach
        // void beforeEach() {
        //     employee = new FDMEmployee("name", "password", "username", "email@e.mail", LocalDateTime.now(), 200, 100);
        // }

        @Test
        @DisplayName("Security Test - creation of security class/variables")
        void secTestClassCreation() {
            assertTrue(employee.getSecurity() instanceof Security);// checks that securrity class is created correctly.
            assertEquals("username", employee.getSecurity().getUserName());
        }

        @Test
        @DisplayName("Security Test - logging out changes the unlocked")
        void secTestLoggedOut() {
            employee.getSecurity().logout();
            assertFalse(employee.getSecurity().isUnlocked());// checks loggin out sets the right variable.
        }

        @Test
        @DisplayName("Security Test - wrong password")
        void secTestWrongPw() {
            
            employee.getSecurity().logout();
            employee.getSecurity().login("username", "wrongpassword");
            assertFalse(employee.getSecurity().isUnlocked(),
                    "checks if logged in when wrong password only entered");
        }

        @Test
        @DisplayName("Security Test - wrong username")
        void secTestWrongUn() {
            employee.getSecurity().logout();
            employee.getSecurity().login("wrongusername", "password");
            assertFalse(employee.getSecurity().isUnlocked(), "checks if logged in when wrong username entered");
        }

        @Test
        @DisplayName("Security Test - wrong credentials")
        void secTestWrongUnPw() {
            employee.getSecurity().logout();
            employee.getSecurity().login("wrongusername", "wrongpassword");
            assertFalse(employee.getSecurity().isUnlocked(),
                    "checks if logged in when wrong username and password entered");
        }

        @Test
        @DisplayName("Security Test - correct credentials")
        void secTestRightUnPw() {
            employee.getSecurity().logout();
            employee.getSecurity().login("username", "password");
            assertTrue(employee.getSecurity().isUnlocked(),
                    "checks if logged in when correct credentials entered");
        }

        @Test
        @DisplayName("Security Test - not case sensitive username")
        void secTestCaseUn() {
            employee.getSecurity().logout();
            employee.getSecurity().login("USERNAME", "password");
            assertFalse(employee.getSecurity().isUnlocked(),
                    "checks if logged in when wrong username entered(case)");
        }

        @Test
        @DisplayName("Security Test - case sensitive email")
        void secTestCaseEmail() {
            employee.getSecurity().logout();
            employee.getSecurity().login("EMAIL@E.MAIL", "password");
            assertTrue(employee.getSecurity().isUnlocked(),
                    "checks if logged in when correct credentials entered");
        }
        @Test
        @DisplayName("Security Test - case sensitive email")
        void secTestCaseEmailcase() {
            employee.getSecurity().logout();
            employee.getSecurity().login("email@e.mail", "password");
            assertTrue(employee.getSecurity().isUnlocked(),
                    "checks if logged in when correct credentials entered");
        }
    }
    @Nested
    @DisplayName("Health History Tests")
    class HealthHist {

        @BeforeEach
        void beforeEach() {
             employee = new FDMEmployee("name", "password", "username", "email@e.mail", LocalDateTime.now(), 200, 100);
             
        }

        @Test
        @DisplayName("Health History Test - creation of class")
        void helTestClassCreation() {
            assertTrue(employee.getHealthHistory() instanceof HealthHistory);// checks that class is created correctly.
        }

        @Test
        @DisplayName("Health History Test - bmi calc")
        void helTestBMI() {
            assertEquals(25.0, employee.getHealthHistory().getCurrentBMI());
            assertEquals("Overweight", employee.getHealthHistory().getCurrentBMIStatus(employee.getHealthHistory().getCurrentBMI()));
        }

        @Test
        @DisplayName("Health History Test - logging a new weight")
        void helTestlogWeight() {
            employee.getHealthHistory().logWeight(99);
            assertEquals(24.8, employee.getHealthHistory().getCurrentBMI());
            assertEquals(99, employee.getHealthHistory().getWeightHistory().get(employee.getHealthHistory().getWeightHistory().size()-1).getWeight());

            //assertEquals(25.0, employee.getHealthHistory().getCurrentBMI());
            //assertEquals("Overweight", employee.getHealthHistory().getCurrentBMIStatus(employee.getHealthHistory().getCurrentBMI()));
        }
        @Test
        @DisplayName("Health History Test - logging a new height")
        void helTestlogHeight() {
            employee.getHealthHistory().logHeight(201);
            assertEquals(24.8, employee.getHealthHistory().getCurrentBMI());
            assertEquals(201, employee.getHealthHistory().getHeightHistory().get(employee.getHealthHistory().getHeightHistory().size()-1).getHeight());


        }
        @Test
        @DisplayName("Health History Test - logging calorie entry")
        void helTestlogCal() {
            employee.getHealthHistory().logCalories(99, "Peanut Butter");
            assertEquals(24.8, employee.getHealthHistory().getCurrentBMI());
            assertEquals(99, employee.getHealthHistory().getWeightHistory().get(employee.getHealthHistory().getWeightHistory().size()-1).getWeight());

            //assertEquals(25.0, employee.getHealthHistory().getCurrentBMI());
            //assertEquals("Overweight", employee.getHealthHistory().getCurrentBMIStatus(employee.getHealthHistory().getCurrentBMI()));
        }
        // public void logCalories(int calories, String nameOfFood, int weightOfFood) {
        //     Food foodItem = new Food(nameOfFood, calories, weightOfFood);
        //     foodHistory.add(foodItem);
        //     calorieHistory.add(new Calorie(foodItem, weightOfFood));
        // }


        

    }

    // @Test
    // void whenDivideByZero_thenAssertException() {
    // assertThrows(ArithmeticException.class, () ->
    // SimpleCalculator.divideNumbers(10, 0));
    // }

    // @RepeatedTest(5)
    // @DisplayName("Ensure correct handling of zero")
    // public void testMultiplyWithZero() {
    // assertEquals(0, calculator.multiply(0,5), "Multiple with zero should be
    // zero");
    // assertEquals(0, calculator.multiply(5,0), "Multiple with zero should be
    // zero");
    // }
}