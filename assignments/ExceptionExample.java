public class ExceptionExample {

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        System.out.println("Program starting...");

        // 1. The 'try' block contains code that might throw an exception
        try {
            int result = numerator / denominator; // This will trigger an error
            System.out.println("The result is: " + result); 
            
        } 
        // 2. The 'catch' block handles the specific exception if it occurs
        catch (ArithmeticException e) {
            System.out.println("Error caught: Cannot divide a number by zero!");
            // You can also print the system error message:
            // System.out.println("System message: " + e.getMessage());
        } 
        // 3. The 'finally' block ALWAYS executes, regardless of success or failure
        finally {
            System.out.println("The 'finally' block has executed.");
        }

        System.out.println("Program continues normally after handling the exception.");
    }
}
