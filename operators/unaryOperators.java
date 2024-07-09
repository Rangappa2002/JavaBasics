public class unaryOperators {
    public static void main(String[] args) {
        int a = 5;

        int  res = ++a;
        System.out.println("Value of a after pre-increment: " + a); 

        res = a++;
        System.out.println("Value of a after post-increment: " + a); 

        res = --a;
        System.out.println("Value of a after pre-decrement: " + a);

        res = a--;
        System.out.println("Value of a after post-decrement: " + a); 
    }
}
