public class FibonacciSequence {

    public static void main(String[] args) {
        int n1 = 0, n2 = 1; 
        int nextNumber = 0;

        System.out.print("Fibonacci Sequence up to 21: " + n1 + ", " + n2);

        
        while (nextNumber <= 21) {
            nextNumber = n1 + n2;
            if (nextNumber > 21) {
                break;
            }
            System.out.print(", " + nextNumber);

           
            n1 = n2;
            n2 = nextNumber;
        }
    }
}