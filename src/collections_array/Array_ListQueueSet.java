package collections_array;

import java.util.*;

public class Array_ListQueueSet {

    public static void main(String[] args) {

        
        System.out.println("LIST - Names");

        List<String> names = new ArrayList<>();
        names.add("Arun");
        names.add("Bala");
        names.add("Chitra");
        names.add("Deepa");

        System.out.println("Names List: " + names);


      
        System.out.println("\nQUEUE - Numbers");

        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(25);
        numbers.add(10);
        numbers.add(40);
        numbers.add(15);

        System.out.println("Numbers Queue: " + numbers);
        System.out.println("Removed element: " + numbers.poll());
        System.out.println("After removal: " + numbers);


    
        System.out.println("\nSET - Colours");

        Set<String> colours = new HashSet<>();
        colours.add("Red");
        colours.add("Blue");
        colours.add("Green");
        colours.add("Red");   // duplicate not allowed

        System.out.println("Colours Set: " + colours);


       
        System.out.println("\nSORTED SET - Numbers");

        Set<Integer> sortedNumbers = new TreeSet<>();
        sortedNumbers.add(90);
        sortedNumbers.add(20);
        sortedNumbers.add(50);
        sortedNumbers.add(10);

        System.out.println("Sorted Numbers: " + sortedNumbers);
    }
}
