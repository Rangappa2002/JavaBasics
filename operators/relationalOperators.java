public class relationalOperators {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        boolean res = (a == b);
        System.out.println("a == b: " + res); 

        res = (a != b);
        System.out.println("a != b: " + res); 

        res = (a > b);
        System.out.println("a > b: " + res); 

        res = (a < b);
        System.out.println("a < b: " + res); 

        res = (a >= b);
        System.out.println("a >= b: " + res); 

        res = (a <= b);
        System.out.println("a <= b: " + res); 
    }
}
