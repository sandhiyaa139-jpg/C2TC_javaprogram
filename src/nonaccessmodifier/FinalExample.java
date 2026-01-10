package nonaccessmodifier;

public class FinalExample {

    final int x = 100;

    final void print() {
        System.out.println("Print the value of x: " + x);
    }

    public static void main(String[] args) {

        FinalExample fe = new FinalExample();
        fe.print();   // valid

        // fe.x = 200;  ❌ removed (cannot modify final variable)
    }
}

// Child class
class Example extends FinalExample {
    // Cannot override final method print()
}

