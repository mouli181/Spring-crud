public class MainEx {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello");
        System.out.println(s);
        s.append(" World");
        System.out.println(s);
        s.insert(6,"Java ");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        s.delete(6,11);
        System.out.println(s);
    }
}
