public class Looping {

    static String[] bands = {"Joywave", "Gorillaz","Imagine Dragons","Metallica",
            "Iron Maiden","Led Zeppelin"};

    static int[] pwr2 = {1,2,4,6,16,32,64,128,256,512,1024};

    static boolean[] bools = {true,false,true,false,false,false,true};

    public static void main(String[] args) {
        whileloop(); //ignore
        forLoop(); //ignore
        forEnhancedLoop(); //ignore

    }

    private static void forEnhancedLoop() {
        for(boolean b : bools) {
            System.out.println(b);
        }
    }

    private static void forLoop() {
        for (int i = 0;i<bands.length;i++){
            System.out.println(i);
            System.out.println(bands[i]);
        }
    }

    private static void whileloop() {
        int i =0;
        while(i < pwr2.length){
            System.out.println(pwr2[i]);
        }
    }
}
