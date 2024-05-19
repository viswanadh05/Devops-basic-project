package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BMICalculatorTest {

    @Test
    public void testCalculateBMI() {
        // Test data
        double weight = 70; // kg
        double height = 175; // cm

        // Expected result
        double expectedBMI = 22.86; // Rounded to two decimal places

        // Calculate actual result
        double actualBMI = BMICalculator.calculateBMI(weight, height);

        // Assert the result (tolerance for floating point arithmetic)
        assertEquals(expectedBMI, actualBMI, 0.01);
    }

    @Test
    public void testCalculateBMIWithZeroHeight() {
        // Test data
        double weight = 70; // kg
        double height = 0; // cm

        // Expected result
        double expectedBMI = Double.POSITIVE_INFINITY;

        // Calculate actual result
        double actualBMI = BMICalculator.calculateBMI(weight, height);

        // Assert the result
        assertEquals(expectedBMI, actualBMI, 0.01);
    }
}
