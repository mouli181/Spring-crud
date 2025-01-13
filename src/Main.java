import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the name");
        String str = s.next();
        System.out.println(str);
        Object obj = new Object();
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());

    }
    }
