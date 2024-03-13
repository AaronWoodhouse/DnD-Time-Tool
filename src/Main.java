import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        DateTime currentTime;
        Savefile savefile;

        // Get starting time
        // New file or load?
        // set start time
        // display time and available actions












        DateTime dt = new DateTime();
        dt.setTime(new int[] {1202,10,3,16,24,46});
        dt.addTime(new int[] {1,0,0,8,24,46});
        dt.printTime();
        System.out.println();
        System.out.println(dt.getTimeOfDay());
        System.out.println(dt.getMonth());

        DateTime dt2 = new DateTime();
        savefile = new Savefile();
        //savefile.save("savefile.txt", dt);
        dt2 = Savefile.load("savefile.txt");
        dt2.printTime();

    }


}