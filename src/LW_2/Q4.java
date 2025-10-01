package LW_2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter five numbers :");
        for (int i = 0; i< 5; i++){
          numbers[i] = scanner.nextInt();
        }

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 1; i< 5; i++){
           if (numbers[i] > largest){
               largest = numbers[i];
           }
        }
        for (int i = 0; i < 5; i++){
            if (numbers[i] != largest){
                if (secondLargest == largest || numbers[i] > secondLargest) {
                   secondLargest = numbers[i];
                }
            }
        }
        System.out.println("The second number is :" + secondLargest);
    }
}
