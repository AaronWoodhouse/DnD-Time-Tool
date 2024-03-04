import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Savefile {
    public void save(String filename, DateTime dt) {
        try {
            File file = new File(filename); // Previously deleted file can reappear
            FileWriter writer = new FileWriter(filename);
            Scanner scanner = new Scanner(System.in);

            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
                for (int x : dt.getTime()) {
                    writer.write(Integer.toString(x) + "\n");
                }

                System.out.println("Saved!");

            } else {
                System.out.println("File already exists.");
                System.out.println("Overwrite Save file? (Y/N)");
                String input = scanner.nextLine();

                if (input.equals("Y") || input.equals("y")) {
                    for (int x : dt.getTime()) {
                        writer.write(Integer.toString(x) + "\n");
                    }
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

    public static DateTime load(String filename) {
        int[] data = new int[6];
        try {
            File file = new File(filename);
            Scanner reader = new Scanner(file);
            int c = 0;
            while (reader.hasNextLine()) {
                data[c] = Integer.parseInt(reader.nextLine());
                c++;
            }

        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }

        DateTime dt = new DateTime();
        dt.setTime(data);
        System.out.println("Loaded!");
        return dt;
    }
}
