package File_IO;

import java.io.FileWriter;
import java.io.IOException;

public class InputWriteEx {
    public static void main(String[] args) {
        // Use try-with-resources for automatic resource management
        try (FileWriter f = new FileWriter("C:\\Users\\dell\\Main\\src\\File_IO\\test.txt")) {
            f.write("Welcome to Java File IO classes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
