public class DateTime {

    // NOT USING HARPTOS EXTRA 5 DAYS
    // user defined accuracy viewing

    // save file, saves accuracy and time
    // set defaults int values of 0

    String[] months = {"Hammer (\"Deepwinter\")","Alturiak (\"The Claw of Winter\")","Ches (\"The Claw of Sunsets\")","Tarsakh (\"The Claw of Storms\")","Mirtul (\"The Melting\")","Kythorn (\"The Time of Flowers\")","Flamerule (\"Summertide\")","Eleasis (\"Highsun\")","Eleint (\"The Fading\")","Marpenoth (\"Leaffall\")","Uktar (\"The Rotting\")","Nightal (\"The Drawing Down\")\n"};

    String[] timeOfDay = {"Midnight","Moondark","Night's end","Dawn","Morning","Noon","Afternoon","Dusk","Sunset","Evening"};
    int[] hourMarks = {0,1,5,6,7,12,13,17,18,19};

    int year, month, day, hour, minute, second = 0;

    public int[] getTime() {
        return new int[] {year,month,day,hour,minute,second};
    }

    public void printTime() {
        System.out.printf("%sy-%sm-%sd-%sh-%sm-%ss",year,month,day,hour,minute,second);
        System.out.printf(getMonth() + ", %sd", day);
        System.out.println(getTimeOfDay());
        // 1202y-12m-10d-5m-54s
    }

    public String getMonth() {
        return months[month - 1];
    }

    public String getTimeOfDay() {

        int c = 0;
        for (int h : hourMarks) {
            if (h > hour) {
                return timeOfDay[c - 1];
            }
            c++;
        }
        return timeOfDay[9];    // Evening

    }

    public void setTime(int[] args) {

        if (args.length != 6) {
            throw new IllegalArgumentException("Must be in the form of y,m,d,h,m,s");
        }

        year = args[0];
        month = args[1];
        day = args[2];
        hour = args[3];
        minute = args[4];
        second = args[5];
    }

    //y,m,d,h,m,s
    public void addTime(int[] args) {

        year += args[0];
        month += args[1];
        day += args[2];
        hour += args[3];
        minute += args[4];
        second += args[5];

        while (second >= 60) {
            minute += 1;
            second -= 60;
        }

        while (minute >= 60) {
            hour += 1;
            minute -= 60;
        }

        while (hour >= 24) {
            day += 1;
            hour -= 24;
        }

        while (day >= 30) {
            month += 1;
            day -= 30;
        }

        while (month >= 12) {
            year += 1;
            month -= 12;
        }



    }

}
