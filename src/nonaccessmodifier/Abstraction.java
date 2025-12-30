package nonaccessmodifier;

// Abstract class
abstract class Shape_Example {
    abstract void draw(); // declaration
}

// Child class
class Square extends Shape_Example {
    void draw() {
        System.out.println("Drawing a square");
    }
}

// Main class
public class Abstraction {
    public static void main(String[] args) {
        Square s = new Square();
        s.draw();
    }
}

