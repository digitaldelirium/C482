import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        char c = '\u0000';
        if (args[0] != null){
                c = args[0].charAt(0);
        }
        else {
                System.out.println("Please enter a character for evaluation");
                Scanner in = new Scanner(System.in);
                if(in.hasNext()) {
                    String temp = in.next().toString();
                    c = temp.charAt(0);
                }
            }

        switch(c){
            case 'a':case 'e':case 'i':case 'o':case 'u':
                System.out.println("You entered a vowel!");
                break;
            case 'b':case 'c':case 'd':case 'f':case 'g':case 'h':case 'j':case 'k':case 'l':case 'm':
                System.out.println("You entered a consonant in the first half of the alphabet!");
                break;
            case 'n':case 'p':case 'q':case 's':case 't':case 'v':case 'w':case 'x':case 'y':case 'z':
                System.out.println("You entered a consonant in the last half of the alphabet!");
                break;
            case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':
                System.out.println("You entered a number between 0 and 9!");
                break;
            default:
                System.out.println("You entered a value that was not a letter, or was a number greater than 9!");
                break;
        }
    }
}