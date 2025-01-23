package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        m.put("first_name","Moulitharan");
        m.put("last_name","C");
        System.out.println(m);
        System.out.println(m.get("first_name"));

        Map<String,Integer> t = new TreeMap<>();
        t.put("banana",100);
        t.put("apple",200);
        t.put("orange",50);
        System.out.println(t);

    }
}
