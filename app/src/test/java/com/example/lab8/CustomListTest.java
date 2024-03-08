package com.example.lab8;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomListTest {
    private CustomList customList;

    @BeforeEach
    public void setUp() {
        customList = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void testAddCity() {
        // Arrange
        City city = new City("Test City", "Test Province");

        // Act
        customList.addCity(city);

        // Assert
        assertEquals(1, customList.getCount());
    }

    @Test
    public void testHasCity() {
        // Arrange
        City city1 = new City("City 1", "Province 1");
        City city2 = new City("City 2", "Province 2");
        customList.addCity(city1);

        // Assert
        assertTrue(customList.hasCity(city1));
        assertFalse(customList.hasCity(city2)); // This assertion will fail initially
    }
}

