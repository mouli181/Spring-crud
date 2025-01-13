public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello");
        s.append(" World");
        System.out.println(s);
        s.insert(5," Java ");
        System.out.println(s);
        System.out.println(s.reverse());
        StringBuilder s1 = new StringBuilder("welcome");
        System.out.println(s1.isEmpty());
    }
}
