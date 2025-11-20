package LW_4;

import java.util.Scanner;
import java.util.Random;

public class Q11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;

        int guess = 0;

        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess > number) {
                System.out.println("Too high! Try again.");
            }
            else if (guess < number) {
                System.out.println("Too low! Try again.");
            }
            else {
                System.out.println("Correct! You guessed the number!");
            }
        }

        input.close();
    }
}
