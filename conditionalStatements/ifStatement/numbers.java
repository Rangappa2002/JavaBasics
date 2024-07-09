package ifStatement;

import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number >= 10) {
            System.out.println("The number is greater than or equal to 10.");
        } 

        scanner.close();
    }
    
}
