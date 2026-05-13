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
