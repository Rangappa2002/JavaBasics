public class maxNumber {
    
    public static void main(String[] args) {
        int a = 80;
        int b = 50;
        int c = 30;
        int d = 40;

        int max1 = (a > b) ? a : b;
        int max2 = (b > c) ? c : d;
        int max = (max1 > max2) ? max1 : max2;

        
        System.out.println("The maximum value is: " + max);
    }
}
