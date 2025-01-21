package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetEx {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("apple");
        s.add("banana");
        s.add("apple");
        s.add("orange");
        System.out.println(s);

        Set s1 = new LinkedHashSet();
        s1.add(1);
        s1.add(2);
        s.add(1);
        s1.add(3);
        System.out.println(s1);

        Set<Integer> s2 = new TreeSet<>();
        s2.add(10);
        s2.add(20);
        s2.add(15);
        s2.add(4);
        System.out.println(s2);
    }
}
