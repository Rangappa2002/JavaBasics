package nestedStatements;

import java.util.Scanner;

public class compareNumbers {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 numbers: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 numbers: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			if (num1>0) {
			System.out.println(num1+" is greater than "+num2+" and is positive");
			} else {
				System.out.println(num1+" is greater than "+num2+" and is negative");
			}
		} else {
			System.out.println(num1+" is lesser than "+num2);
		}
	}

}
