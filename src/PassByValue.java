import static javax.management.Query.value;

public class PassByValue {
    public static void main(String[] args) {
        int a = 5;
        atchaya(a);
        System.out.println(atchaya(a));
    }

    private static int atchaya(int a) {
        return a = 10;
    }

}
