### Example-1
~~~
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        writer.write("Hello File");
        writer.close();

        System.out.println("File created and written.");
    }
}
~~~
Example-02
~~~
import java.io.File;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) throws Exception {
        File file = new File("test.txt");

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}
~~~
