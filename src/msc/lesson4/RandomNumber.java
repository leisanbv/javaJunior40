

package msc.lesson4;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        // execute a random number [0;5]
        int answer, guess;
        int MAX = 5;
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        answer = rand.nextInt(MAX) + 1;
        System.out.println("Guess a number: ");
        guess = keyboard.nextInt();
        if (guess==answer){
            System.out.println("Good job! The number is: " + answer);}
        else{
            System.out.println("Sorry, the correct number is: " + answer);

        }
    }
}
