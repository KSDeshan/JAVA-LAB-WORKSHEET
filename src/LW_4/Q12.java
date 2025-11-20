package LW_4;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence :");
        String sentence = input.nextLine();

        System.out.print("Enter the world to replace :");
        String oldWord = input.nextLine();

        System.out.print("Enter the replacement word :");
        String newWord = input.nextLine();

        String updatedSentence = sentence.replace(oldWord, newWord);

        System.out.println("\nUpdated Sentence:");
        System.out.println(updatedSentence);

        input.close();

    }
}