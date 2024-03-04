public class Main {
    public static void main(String[] args) {
        DateTime dt = new DateTime();
        dt.setTime(new int[] {1202,10,3,16,24,46});
        dt.addTime(new int[] {1,0,0,8,24,46});
        dt.printTime();
        System.out.println();
        System.out.println(dt.getTimeOfDay());
        System.out.println(dt.getMonth());
    }
}