import java.util.Date;

public class CheckGC {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total JVM memory: " + rt.totalMemory());
        System.out.println("Before Memory = " + rt.freeMemory());

        Date d = null;

        for (int i = 0; i < 10000; i++){
            d = new Date();
            d = null;
        }

        System.out.println("After memory = " + rt.freeMemory());

        for (int x = 0; x < 100; x++){
            rt.gc();
            System.out.println("After GC memory = " + rt.freeMemory());
        }
    }
}