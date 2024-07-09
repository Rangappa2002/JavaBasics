public class assignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int res = a; 
        System.out.println("Simple assignment: " + res);

        res += b; 
        System.out.println("Add and assign: " + res);

        res -= b; 
        System.out.println("Subtract and assign: " + res);

        res *= b;  
        System.out.println("Multiply and assign: " + res);

        res /= b; 
        System.out.println("Divide and assign: " + res);

        res %= b; 
        System.out.println("Modulus and assign: " + res);
    }
}
