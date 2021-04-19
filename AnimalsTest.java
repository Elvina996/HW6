package HW_6;

import HW_6.Animals;

public class AnimalsTest {
    public static void main(String[] args) {
        Cat cat = new Cat( name:"Кузя");
        Dog dog = new Dog( name:"Тузик");

        System.out.println(Animals.getAnimalsCount());
        System.out.println(Cat.getCatCount());
        System.out.println(Dog.getDogCount());

        cat.run( distance: 70);
        dog.run( distence: 100);
        dog.swim( distance: 10);
        cat.swim( distance: 5);

    }
}
