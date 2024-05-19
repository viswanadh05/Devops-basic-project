package com.example;

public class BMICalculator {
    public static double calculateBMI(double weight, double height) {
        if (height == 0) {
            throw new IllegalArgumentException("Height cannot be zero");
        }
        // Convert height from cm to meters
        height = height / 100;
        return weight / (height * height);
    }
}
