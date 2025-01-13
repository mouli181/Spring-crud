public class PassByReference {
    public static void main(String[] args) {
        MyClass m = new MyClass(5);
        modify(m);
        System.out.println(m.a);
    }

    private static void modify(MyClass m) {
        m.a = 10;
    }
}
