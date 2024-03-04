import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Savefile {
    public void save(String filename) {
        try {
            File file = new File(filename);
            FileWriter writer = new FileWriter(filename);
            Scanner scanner = new Scanner(System.in);

            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
                writer.write("flag1");
                System.out.println("Saved!");

            } else {
                System.out.println("File already exists.");
                System.out.println("Overwrite Save file? (Y/N)");
                String input = scanner.nextLine();

                if (input.equals("Y") || input.equals("y")) {
                    writer.write("flag2");
                    System.out.println("Saved!");
                }

            }

            scanner.close();
            writer.close();

        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }

    public void load() {

    }
}
