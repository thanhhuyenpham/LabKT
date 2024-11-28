package com.example.LabKT;

public class trungBinhCong {
    public static double trungBinhCong(double[] numbers) {
        if(numbers == null || numbers.length == 0) {
            throw new ArithmeticException("Array is empty or null");
        } else {
            double sum = 0;
            for (double number: numbers) {
                sum += number;
            }
            return (double) sum / numbers.length;
        }
    }
}
