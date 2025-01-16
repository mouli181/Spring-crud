package Generic;

public class Main {
    public static void main(String[] args) {
        GenericMethod g = new GenericMethod();
        Integer[] i = {1,2,3,4,5};
        String[] s = {"Simple","java","generic"};
        g.display(i);
        g.display(s);
    }
}
