package Exception;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        }
        catch(Exception e) {
            System.out.println("cannot devide by zero " +e.getMessage());
        }
        finally {
            System.out.println("the program ended");
        }
    }

}
