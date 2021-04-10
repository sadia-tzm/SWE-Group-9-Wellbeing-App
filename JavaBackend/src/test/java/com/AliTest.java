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

public class AliTest {

    private FDMEmployee employee;
    private User user;

    @BeforeEach
    public void setUp() throws Exception {
        employee = new FDMEmployee("name", "password", "username", "email@e.mail", LocalDateTime.now(), 200, 100);
    }
}
