package Exceptionhandling;

public class WithoutExceptionHandling {
    public static void main(String[] args) {
        System.out.println("The program starts...");

        try {
            int data = 100 / 0;  // This will throw ArithmeticException
            System.out.println("Data: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("The program continues....");
    }
}
