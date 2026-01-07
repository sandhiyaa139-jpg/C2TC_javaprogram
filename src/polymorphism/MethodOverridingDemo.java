package polymorphism;

// Parent class
class AnimalClass {
    void sound() {
        System.out.println("Animals can make sound");
    }
}

// Child class
class Lion extends AnimalClass {
    @Override
    void sound() {
        System.out.println("Lion roars......");
    }
}

// Main class
public class MethodOverridingDemo {

    public static void main(String[] args) {

        AnimalClass ac = new AnimalClass();
        ac.sound();   // Parent class method

        AnimalClass al = new Lion();
        al.sound();   // Child class overridden method (runtime polymorphism)
    }
}

