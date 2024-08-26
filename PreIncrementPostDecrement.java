public class PreIncrementPostDecrement {

    public static void main(String[] args) {
        int m= 5;  

        
        int result = ++m + m--;

      
        System.out.println("Result of the expression (++m + m--) is: " + result);
        System.out.println("Final value of i after the expression is: " + m);
    }
}