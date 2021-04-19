package HW_6;

import HW_6.Animals;

public class Dog extends Animals {

    private static int dogCount = 0;

    public Dog(String name) {
        super (name);
        runLimit = (int) (20 + Math.random() * 200);
        swimLimit = (int) (5 + Math.random() * 50);
        dogCount++;
    }
    @Override
    public void run(int distance) {
        if (distance <= runLimit ){
            System.out.println("Шарик " + getName() + " пробежал " + distance + "м." );
        }
        else{
            System.out.println("Шарик " + getName() + " не может столько бежать ");
        }


    }

    @Override
    public void swim(int distance) {
        if (distance <= runLimit ){
            System.out.println("Шарик " + getName() + " проплыл " + distance + "м." );
        }
        else{
            System.out.println("Шарик " + getName() + " не может так долго плыть ");
        }

    }
    public static int getDogCount() {
        return dogCount;
    }
}
