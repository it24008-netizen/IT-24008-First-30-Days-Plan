### Example-1
~~~
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("data.bin");
        out.write(65);
        out.write(66);
        out.close();

        FileInputStream in = new FileInputStream("data.bin");
        int data;
        while ((data = in.read()) != -1) {
            System.out.println((char) data);
        }
        in.close();
    }
}
~~~
###Example-2
~~~
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

public class Example2 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("input.txt");
        if (!inputFile.exists()) {
            FileWriter writer = new FileWriter(inputFile);
            writer.write("Hello, this is input file!");
            writer.close();
        }

        FileInputStream in = new FileInputStream("input.txt");
        FileOutputStream out = new FileOutputStream("copy.txt");

        int data;
        while ((data = in.read()) != -1) {
            out.write(data);
        }

        in.close();
        out.close();

        System.out.println("File copied successfully!");
    }
}
~~~
