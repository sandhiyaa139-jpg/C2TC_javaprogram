package collection_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Object> list1 = new ArrayList<>(); // ✅ corrected

        System.out.println("Size : " + list1.size());
        System.out.println("Is list empty? " + list1.isEmpty());

        list1.add(10);
        list1.add(20);
        list1.add(true);
        list1.add(false);
        list1.add(20);
        list1.add("Hello");
        list1.add(56.78);
        list1.add(20);
        list1.add('A');
        list1.add(5, "Hi");
        list1.add(20);

        System.out.println("List is " + list1);

        System.out.println("Is list contains 15? " + list1.contains(15));

        list1.remove(Boolean.FALSE);
        System.out.println("List is " + list1);

        System.out.println("Element at 5 location is : " + list1.get(5));

        list1.remove(list1.lastIndexOf(20));
        list1.remove(list1.indexOf(20));

        System.out.println("List is " + list1);

        list1.clear();
        System.out.println("List is " + list1);

        List<String> names = new ArrayList<>();

        names.add("Amit");
        names.add("Sumit");
        names.add("Ankit");
        names.add("Rohit");
        names.add("Likshit");

        System.out.println("Name List is " + names);

        Collections.reverse(names);
        System.out.println("Reverse Name List is " + names);

        Collections.sort(names);
        System.out.println("Sorted Ascending order " + names);

        Collections.reverse(names);
        System.out.println("Sorted Descending order " + names);

        Iterator<String> i = names.iterator();
        while (i.hasNext()) {
            String nm = i.next();
            if (nm.equals("Ankit")) {
                i.remove();
            }
        }

        ListIterator<String> li = names.listIterator(names.size());
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}


