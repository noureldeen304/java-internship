package com.example.week2;

public class T1 {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 7, 4, 2, 9, 8, 2 };
        int target = 2;
        int position = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (i < 5) {
                    continue;
                }
                position = i;
                break;
            }
        }

        if (position == -1) {
            System.out.println("Target number not found.");
        } else {
            System.out.println("First occurrence of " + target + " is at position " + position);
        }
    }
}
