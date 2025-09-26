public class Days {
    static String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    static String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    public static void main(String[] args) {
        for (int i = 1; i < days.length; i++) {
            System.out.println(days[i]);
        }
        int j = 0;
        while (j<months.length) {
            System.out.println(months[j]);
        }
    }
}
