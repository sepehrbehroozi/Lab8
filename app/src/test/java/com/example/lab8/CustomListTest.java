package com.example.lab8;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}

