package Exceptionhandling;

public class TryCatchDemo {

    // Method for integer division
    static int performDivision(int a, int b) {
        return a / b;   // may throw ArithmeticException
    }

    // Method for float division
    static float performDivision(float a, float b) {
        return a / b;   // no exception, returns Infinity if b = 0
    }

    public static void main(String[] args) {

        System.out.println("I am in main method");
        int result;

        try {
            result = TryCatchDemo.performDivision(12, 0);
            if (result != 0)
                System.out.println("Division is " + result);

            System.out.println("------------------------------");

            result = TryCatchDemo.performDivision(12, 3);
            if (result != 0)
                System.out.println("Division is " + result);

            System.out.println("------------------------------");

        } catch (ArithmeticException e) {
            System.out.println("I am in catch block: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println(TryCatchDemo.performDivision(12f, 5f));

        System.out.println("------------------------------");

        System.out.println(TryCatchDemo.performDivision(12f, 0f));
    }
}
