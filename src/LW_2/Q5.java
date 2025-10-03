package LW_2;

import java.util.Scanner;
public class Q5 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a sentence:");
            String sentence = sc.nextLine();
            String cleaned = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
            String reversed = new StringBuilder(cleaned).reverse().toString();

            if (cleaned.equals(reversed)) {
                System.out.println("The sentence is a palindrome.");
            } else {
                System.out.println("The sentence is not a palindrome.");
            }

        }
    }


