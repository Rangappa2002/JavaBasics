public class logicalOperators {
    
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean res = a && b;
        System.out.println("a && b: " + res); 

        res = a || b;
        System.out.println("a || b: " + res); 

        res = !a;
        System.out.println("!a: " + res);

        res = !b;
        System.out.println("!b: " + res); 
    }
}