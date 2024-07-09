public class case1 {
        public double calculateArea(double length, double width) {
            double area = length * width;
            return area;
        }
    
        public static void main(String[] args) {
            case1 rect = new case1();
            
            double length = 5.0;
            double width = 3.5;
            
            double area = rect.calculateArea(length, width);
 
            System.out.println("The area of the rectangle is: " + area);
        }
    }
    

