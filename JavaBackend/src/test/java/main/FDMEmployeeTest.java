package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.*;
import java.time.*;

public class FDMEmployeeTest {

    private FDMEmployee employee;

    @BeforeEach                                         
    public void setUp() throws Exception {
        employee = new FDMEmployee("name", true,  "password", "username", "email@e.mail", LocalDateTime.now(), 200, 100);
    }

    @Test                                               
    @DisplayName("Simple multiplication should work")   
    public void testMultiply() {
        assertEquals(20, calculator.multiply(4,5),      
        "Regular multiplication should work");          
    }

    @RepeatedTest(5)                                    
    @DisplayName("Ensure correct handling of zero")
    public void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(0,5), "Multiple with zero should be zero");
        assertEquals(0, calculator.multiply(5,0), "Multiple with zero should be zero");
    }
}