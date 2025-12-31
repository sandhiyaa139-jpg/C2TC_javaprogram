package runableinterface;

public class RunnableDemo {

    public static void main(String[] args) {

        // Using implementable class
        Interface obj = new Interface(10, 20, "Hello");
        Thread t1 = new Thread(obj);
        t1.start();

        // Anonymous class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable with Anonymous Class");
            }
        };
        new Thread(runnable).start();

        // Lambda expression
        runnable = () -> {
            System.out.println("Runnable with Lambda Expression");
        };
        new Thread(runnable).start();

        System.out.println("-------------------------------------------------------");

        int n = 5;

        runnable = () -> {
            try {
                for (int i = 1; i <= n; i++) {
                    System.out.println("Loop iteration: " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.err.println("Task interrupted.");
            }
        };

        // Execute the runnable
        new Thread(runnable).start();
    }
}

		




