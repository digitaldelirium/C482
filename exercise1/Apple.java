import food.Fruit;

public class Apple extends Fruit {

    public Apple(){
        this(true,true);
    }

    public Apple(boolean sweet, boolean hard){
        this(sweet,hard,true);
    }

    public Apple(boolean sweet, boolean hard, boolean core){
        this.sweet = sweet;
        this.hard = hard;
        this.core = core;
    }

    public static void main(String[] args) {
        Apple a = new Apple();
        String message = "Apples are ";
        message += (a.isSweet()) ?  "sweet, " :  "bitter, ";
        message += (a.isHard()) ?  "hard, and " :  "soft, and ";
        message += (a.hasCore()) ?  "have a core" :  "have no core";
        System.out.println(message);
    }

    public boolean isSweet(){
        return sweet;
    }

    public boolean isHard(){
        return hard;
    }

    public boolean hasCore(){
        return core;
    }
}