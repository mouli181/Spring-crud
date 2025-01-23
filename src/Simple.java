public class Simple {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.getClass());
        System.out.println(o.hashCode());


        int a = 5;
        Integer b = a;
        System.out.println(b);

        Integer c = Integer.valueOf(a);
        System.out.println(c);

        int d = c.intValue();
        System.out.println(d);
//        Integer c = 10;
//        int d = c;
//        System.out.println(d);
    }
}
