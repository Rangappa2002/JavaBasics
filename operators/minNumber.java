public class minNumber {
    
    public static void main(String[] args) {
        int a = 80;
        int b = 30;
        int c = 50;
        int d = 40;

        int min1 = (a < b) ? a : b;
        int min2 = (b < c) ? c : d;
        int min = (min1 < min2) ? min1 : min2;
        System.out.println("The minimum value is: " + min);
    }
}