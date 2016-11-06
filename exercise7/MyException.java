package exercise7;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Throwable;
import java.lang.Exception;

public class MyException {

class BadFoodException extends Exception { }

public static void main(String[] args) {
    String food = "";
    ArrayList<String> output = new ArrayList<>();
    try {
        if (args[0] != null) {
            for (String s : args){
                food = s;
                output.add(checkFood(s));
            }
        } else {
            System.out.println("Please enter a food: ");
            Scanner in = new Scanner(System.in);
            output.add(checkFood(in.next().toString()));
        }
    } catch (BadFoodException bfe) {
        output.add("Ewww, I hate " + food);
    }

    for(String o : output){
        System.out.println(o);
    }
}

public static String checkFood(String food) throws BadFoodException {
    ArrayList<String> badFoods = new ArrayList<>();
    boolean isBad = false;

    badFoods.add("mushrooms");
    badFoods.add("Indian");
    badFoods.add("sushi");
    for(String f : badFoods){
        if (f.equals(food)){
            throw BadFoodException();
        }
    }
    return food + " sounds good!";
    
}

}