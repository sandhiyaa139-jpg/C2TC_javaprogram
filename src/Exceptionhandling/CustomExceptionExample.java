package Exceptionhandling;

// Custom Exception Class
class InvalidBalanceException extends Exception {
    InvalidBalanceException(String message) {
        super(message);
    }
}

// Main Class
public class CustomExceptionExample {

    // Method that may throw custom exception
    static void withdraw(int balance) throws InvalidBalanceException {
        if (balance < 1000) {
            throw new InvalidBalanceException("Insufficient balance");
        }
        System.out.println("Withdrawal successful");
    }

    // Main Method
    public static void main(String[] args) {
        try {
            withdraw(500); // This will throw exception
        } catch (InvalidBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            withdraw(1500); // This will succeed
        } catch (InvalidBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

