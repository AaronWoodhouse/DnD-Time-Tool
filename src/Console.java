import java.util.Date;
import java.util.Scanner;

public class Console {

    Scanner scanner = new Scanner(System.in);
    String input;

    // Get starting time
    // New file or load?
    // set start time
    // display time and available actions

    public void mainMenu(DateTime dt) {
        System.out.println("=== Harptos Time Tool ===");
        System.out.println("[1] Create New File");
        System.out.println("[2] Load Existing File");
        System.out.println("[3] Exit");
        System.out.print("Selection: ");
        input = scanner.nextLine();

        //input validation

        switch (Integer.parseInt(input)) {
            case 1:
                newFile(dt);
                mainScreen();
                break;

            case 2:
                loadFile(dt);
                mainScreen();
                break;

            case 3:
                exit();
                break;

            default:

        }
    }

    public void mainScreen() {
        displayTime(dt);
        getAction();
    }

    public void displayTime(DateTime dt) {
        dt.printTime();
    }

    public void getAction() {
        System.out.println("=== Actions ===");
        System.out.println("[1] Add Time");
        System.out.println("[2] Subtract Time");
        System.out.println("[3] Set Time");

        // TODO
        System.out.println("[4] Set Time Multiplier");  // Time Distortion
        System.out.println("[X] Main Menu");
        System.out.print("Selection: ");
        input = scanner.nextLine();

        //input validation

        switch (Integer.parseInt(input)) {
            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            default:
        }
    }

    public void newFile(DateTime dt) {
        Savefile savefile = new Savefile();
        System.out.print("Save new file as: ");
        String filename = scanner.nextLine();
        // filename validation
        savefile.save(filename, dt);
    }

    public void loadFile(DateTime dt) {
        Savefile savefile = new Savefile();
        System.out.print("File to load: ");
        String filename = scanner.nextLine();
        // filename validation
        dt = Savefile.load(filename);
    }

    public void exit() {
        System.exit(0);
    }

}
