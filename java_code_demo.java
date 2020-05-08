import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//import java.lang.*;

public class java_code_demo {
    public static void main(String args[]) {
        System.out.println("In main");
        FileReader fr = null;
        try {
            fr = new FileReader("C:/temp");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int lines = 0;
        try {
            lines = fr.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Number of lines read " + lines);
    }
}