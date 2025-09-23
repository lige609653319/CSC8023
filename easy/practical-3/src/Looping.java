public class Looping {

    static String[] bands = {"Joywave", "Gorillaz","Imagine Dragons","Metallica",
            "Iron Maiden","Led Zeppelin"};

    int[] pwr2 = {1,2,4,6,16,32,64,128,256,512,1024};

    static boolean[] bools = {true,false,true,false,false,false,true};

    public static void main(String[] args) {
        for (int i = 0;i<bands.length;i++){
            System.out.println(i);
            System.out.println(bands[i]);
        }
        for(boolean b : bools) {
            System.out.println(b);
        }
        whileloop(); //ignore
        forLoop(); //ignore
        forEnhancedLoop(); //ignore

    }

    private static void forEnhancedLoop() {

    }

    private static void forLoop() {

    }

    private static void whileloop() {
    }
}
