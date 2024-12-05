package com.example.tests;

import com.example.annotations.TestMethodInfo;
import com.example.annotations.Priority;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExampleTest {
    @Test
    @TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
    public void annotation() {
        assertEquals(1, 1);
    }
}