import java.util.Scanner;

public class amount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your initial amount: ");
        int amount = scanner.nextInt();

        while (amount >= 2000) {
            amount -= 2000;
            System.out.println("2000 withdrawn. Current balance:" + amount);
        }

        System.out.println("Insufficient funds. Your balance is " + amount);
        scanner.close();
    }
}