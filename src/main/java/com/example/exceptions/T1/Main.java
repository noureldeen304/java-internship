package com.example.exceptions.T1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean inputValid = false;
        int num1 = 0, num2 = 0;

        while (!inputValid) {
            try {
                System.out.print("Enter the first number: ");
                num1 = input.nextInt();
                inputValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Your input should be in integer type.");
                input.next();
            }
        }

        inputValid = false;

        while (!inputValid) {
            try {
                System.out.print("Enter the second number: ");
                num2 = input.nextInt();
                inputValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Your input should be in integer type.");
                input.next();
            }
        }

        int sum = ArithmeticOperations.sum(num1, num2);
        System.out.println(sum);
        input.close();

    }
}
