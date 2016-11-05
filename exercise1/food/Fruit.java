package food;

public abstract class Fruit{
    protected static boolean sweet;
    protected static boolean hard;
    protected static boolean core;
    protected abstract boolean isSweet();
    protected abstract boolean isHard();
    protected abstract boolean hasCore();
}