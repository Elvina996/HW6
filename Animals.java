package HW_6;

public abstract class Animals {

    private static int animalsCount = 0;

    protected int runLimit;
    protected int swimLimit;
    private final String name;

    public Animals(String name) {
        this.name = name;
        animalsCount++;
    }

    public static int getAnimalsCount(){
        return animalsCount;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public String getName() {
        return name;
    }

}
