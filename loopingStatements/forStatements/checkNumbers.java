package loopingStatements.forStatements;

import java.util.Scanner;

public class checkNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (up to 100): ");
        int number = scanner.nextInt();

        if (number > 100 || number <= 0) {
            System.out.println("Invalid input! Please enter a number between 1 and 100.");
        } else {
            for (int i = number; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even.");
                } else {
                    System.out.println(i + " is odd.");
                }
            }
        }

        scanner.close();
    }
    
}
