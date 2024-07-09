public class case2 {
    public void printGreeting(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    public static void main(String[] args) {

        case2 obj = new case2();
        
        obj.printGreeting("Alice", 30);
    }
    
}
