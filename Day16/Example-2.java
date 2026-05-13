import java.io.FileInputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("output.txt");

        int data;
        while ((data = in.read()) != -1) {
            System.out.print((char) data);
        }

        in.close();
    }
}
