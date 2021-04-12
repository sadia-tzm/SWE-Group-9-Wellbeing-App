package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import java.time.*;
import java.util.concurrent.TimeUnit;

import com.firebaseStuff.FirebaseDatabase;
import com.google.cloud.firestore.DocumentSnapshot;

/**
 * 
 * @author Ollie
 */
public class OllieDBTests {

    private FDMEmployee employee;

    @BeforeEach
    public void setUp() throws Exception {
        employee = new FDMEmployee("name", "password", "username", "email@e.mail", LocalDateTime.now(), 200, 100);

    }

    @Test
    @DisplayName("Minor test of strength")
    public void testGetters() throws InterruptedException {
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
    }
}