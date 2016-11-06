import java.lang.Throwable;

public class LabeledWhile {
    static int age;

    public static void main(String[] args) {
        try {
            if (args[0] != null) {
                try {
                    age = Integer.valueOf(args[0]);
                } catch (NumberFormatException nfe) {
                    System.out.println(nfe.getMessage());
                    age = 0;
                }
            }
        } catch (Exception e) {
            age = 0;
        }

        OUTER: while (age <= 21) {
            if (age == 16) {
                System.out.println("get your driver\'s license!");
                age++;
                continue OUTER;
            } else if (age == 21) {
                System.out.println("Congratulations, you\'ve met beer!");
            } else {
                System.out.println("Another year...");
            }
            age++;
        }
    }
}