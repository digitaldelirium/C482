import java.util.Scanner;

public class ShortCast {
    public static void main(String[] args) {
        float f = 0.0F;
        short s = 0;
        
        if (args[0] != null){
            f = Float.parseFloat(args[0]);
        }
        else {
            getFloat();
        }

        s = (short)f;

        System.out.println(String.format("Float value is: %1f, Short value is: %2d", f, s));
    }

    public static float getFloat(){
        float f = 0F;
        System.out.println("Please enter any number, it may be non-integer:");
        Scanner in = new Scanner(System.in);

        if (in.hasNextFloat()){
            f = in.nextFloat();
        }
        else {
            System.out.println("You're a jackass... Next time listen to instructions!");
            System.exit(0);
        }
        
        return f;
    }
}

