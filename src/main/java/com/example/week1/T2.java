package com.example.week1;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("sum: " + (num1 + num2));
        System.out.println("difference: " + (num1 - num2));
        System.out.println("product: " + (num1 * num2));
        System.out.println("division: " + (num1 / num2));

    }
}
