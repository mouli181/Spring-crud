package Map;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        // Create an ArrayList and add elements to it
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        ArrayList<Integer> veg = new ArrayList<>();
        veg.add(20);
        veg.add(30);
        veg.add(50);
        for(int i : veg){
            System.out.println(i);
        }
        System.out.println(veg);
        for(String s : fruits){
            System.out.println(s);
        }

        // Get the iterator for the ArrayList
        Iterator<String> iterator = fruits.iterator();

        // Iterate through the ArrayList using the Iterator
        System.out.println("Fruits in the list:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
