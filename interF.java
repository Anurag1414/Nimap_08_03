package Nimap_08_03;

import java.net.InterfaceAddress;

public interface interF {

    void eat();
    public static final int max = 150;

    void sleep();

    public static void info() {
        System.out.println("Animal interface");
    }

    public default void run() {
        System.out.println("i am running");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        System.out.println(dog.max);
        System.out.println(interF.max);
        interF.info();
        interF.info();
        dog.run();

    }
}

class Dog implements interF {

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

}
