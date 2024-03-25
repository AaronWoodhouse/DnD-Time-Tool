import java.awt.desktop.SystemSleepEvent;
import java.util.Date;
import java.util.Scanner;

public class Console {

    Scanner scanner = new Scanner(System.in);
    String input;

    public void mainMenu(DateTime dt) {
        System.out.println("=== Harptos Time Tool ===");
        System.out.println("[1] Create New File");
        System.out.println("[2] Load Existing File");
        System.out.println("[3] Exit");
        System.out.print("Selection: ");
        input = scanner.nextLine();

        // TODO: input validation

        switch (Integer.parseInt(input)) {
            case 1:
                String inputTime = getInput();
                int[] time = parseTime(inputTime);
                setTime(dt, time);
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
        displayTime();
        getAction();
    }

    private String getInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private int[] parseTime(String inputTime) {
        String[] splitInput = inputTime.split(",");


        return 0;
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

    public void setTime(DateTime dt, int[] vals) {
        System.out.println("What is the current time?");
        String input = scanner.nextLine();
        // input validation
        dt.setTime(vals);
    }

    public void newFile(DateTime dt) {
        Savefile savefile = new Savefile();
        System.out.print("Save new file as: ");
        String filename = scanner.nextLine();
        // filename validation
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
