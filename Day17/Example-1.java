import java.io.File;

public class DirectoryExample1 {
    public static void main(String[] args) {

        // Create directory object
        File dir = new File("MyFolder");

        // 1. Create directory
        if (dir.mkdir()) {
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("Directory already exists or failed.");
        }

        // 2. Check directory exists
        if (dir.exists()) {
            System.out.println("Directory exists: " + dir.getName());
        }

        // 3. Delete directory (must be empty)
        if (dir.delete()) {
            System.out.println("Directory deleted successfully.");
        } else {
            System.out.println("Directory not deleted (maybe not empty).");
        }
    }
}
