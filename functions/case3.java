public class case3 {
    public int generateNumber() {
        int number = 42; 
        return number;
    }

    public static void main(String[] args) {
        case3 example = new case3();
        int result = example.generateNumber(); 
        System.out.println("Generated number: " + result);
    }
}
