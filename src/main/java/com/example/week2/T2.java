package com.example.week2;

public class T2 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 4};
        
        int sum = calculateSum(arr);
        double average = calculateAverage(arr);
        
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
    
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    public static double calculateAverage(int[] arr) {
        int sum = calculateSum(arr);
        double average = (double) sum / arr.length;
        return average;
    }
}
