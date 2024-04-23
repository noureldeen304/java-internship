package com.example.week1;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int weekendNum = input.nextInt();

        switch (weekendNum) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");

                break;
            case 3:
                System.out.println("Monday");

                break;
            case 4:
                System.out.println("Tuesday");

                break;
            case 5:
                System.out.println("wednesday");

                break;
            case 6:
                System.out.println("Thrusday");

                break;
            case 7:
                System.out.println("Friday");

                break;

            default:
                System.out.println("Invalid Input");
                break;
        }

    }
}
