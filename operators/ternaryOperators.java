public class ternaryOperators {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        System.out.println("The maximum value is: " + max); 

        int min = (a < b) ? a : b;
        System.out.println("The minimum value is: " + min); 
    }
}
