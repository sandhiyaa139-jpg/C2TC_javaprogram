package oops_concepts;

public class Inheritance {

	public static void main(String[] args) {
		Animal1 animal = new Animal1("Generic Animal");
        Dogss dog = new Dogss("Tommy", "Labrador");
        
        animal.display();
        dog.display();
    }
}

class Animal1 {
    String name;

    // Constructor to initialize the value
    Animal1(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Animal name: " + name);
    }
}

class Dogss extends Animal1 {
    String breed;

    Dogss(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Dog breed: " + breed);
    }
}
