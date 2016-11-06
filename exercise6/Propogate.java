import java.util.Scanner;
import java.lang.Throwable;
import java.lang.Exception;

public class Propogate {
    public static void main(String[] args) {
        String output = "";

        try {
            if (args[0] != null) {
                System.out.println("Initial String: " + args[0].toString());
                reverse(args[0]);
                
            }
        } catch (Exception e) {
            System.out.println("Caught an exception");                
        }
        finally {
            if (output != ""){
                System.out.println("Reversed String: " + output);
            }
            System.out.println("Program exited, thanks for playing!");
        }
    }

    public static String reverse(String str) throws Exception {
        String reverseStr = "";

        if (str.length() == 0){
            throw new Exception();
        }
        else {
            for (int i = str.length()-1; i >= 0; --i) {
                reverseStr += str.charAt(i);
            }
        }
        return reverseStr;
    }
}