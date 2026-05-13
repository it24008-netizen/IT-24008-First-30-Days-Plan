import java.nio.file.*;

public class DirectoryExample2 {
    public static void main(String[] args) {

        try {
            Path path = Paths.get("DataFolder");

            // 1. Create directory
            if (!Files.exists(path)) {
                Files.createDirectory(path);
                System.out.println("Directory created.");
            }

            // 2. Create files inside directory
            Path file1 = Paths.get("DataFolder/file1.txt");
            Path file2 = Paths.get("DataFolder/file2.txt");

            Files.createFile(file1);
            Files.createFile(file2);

            System.out.println("Files created inside directory.");

            // 3. List files in directory
            System.out.println("Files in directory:");
            DirectoryStream<Path> stream = Files.newDirectoryStream(path);

            for (Path file : stream) {
                System.out.println(file.getFileName());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
