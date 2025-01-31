package File_IO;

import java.io.FileInputStream;
import java.io.IOException;

public class InputReader {
    public static void main(String[] args) {
        try{
            FileInputStream f = new FileInputStream("C:\\Users\\dell\\Main\\src\\File_IO\\test.txt");
            int data;
            while((data = f.read())!= -1){
                System.out.print((char)data);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
