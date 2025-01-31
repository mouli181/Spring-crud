public class PassValueEx {
    public static void main(String[] args) {
        int num = 5;
        modify(num);
        System.out.println(num);
    }

    static void modify(int n) {
       n = 10;
    }

}
