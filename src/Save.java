import java.io.File;
import java.io.IOException;

public class Save {
    public void save() {
        try {
            File file = new File("filename.txt");

            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File already exists.");
                // ask if user wants to overwrite
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }
}
