package LW_1;

import java.util.Scanner;

public class Q1 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter odd length word:");
       String word = sc.nextLine();

       int length = word.length();

       if (length % 2 ==0){
          System.out.println("Error: Please enter a word with odd number of characters.");
       }else {
           int middleIndex = length /2;
           char middleChar = word.charAt(middleIndex);
           System.out.println("Middle character:" + middleChar);
       }
       sc.close();
   }
}
