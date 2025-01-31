package AccessModifiers;

import Arithmetic.Addition;

public class Main {
    public static void main(String[] args) {
        PrivateEx e = new PrivateEx();
        e.display();
        Addition a = new Addition(10,20);
        System.out.println(a.add());

    }
}
