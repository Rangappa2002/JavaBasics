public class sequenceFunction {
    public void printSequence(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        sequenceFunction sequence = new sequenceFunction();
        
        System.out.println("Sequence from 1 to 10:");
        sequence.printSequence(1, 10);
        
        System.out.println("Sequence from 5 to 15:");
        sequence.printSequence(5, 15);
    }    
}
