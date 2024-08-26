public class Even{

    public static void main(String[] args) {
        System.out.println("Even numbers between 1 and 50 are:");

        
        for (int number = 1; number <= 50; number++) {
            
            if (number % 2 == 0) {
                
                System.out.println(number);
            }
        }
    }
}