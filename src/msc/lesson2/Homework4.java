package msc.lesson2;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        // Написать программу для определения положительное или отрицательное число
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}


