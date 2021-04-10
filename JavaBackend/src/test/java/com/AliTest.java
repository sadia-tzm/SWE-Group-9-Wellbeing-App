package com;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
//import java.util.*;
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
    }
}
