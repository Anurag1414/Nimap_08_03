package Nimap_08_03;

abstract class Animal {

    abstract void makeSound();
}

interface Vehicle2 {

    void drive();
}

interface Vehicle {

    void drive();
}

public class Main {

    public static void main(String[] args) {
        Animal myAnimal = new Animal() {  // Anonymous inner class
            void makeSound() {
                System.out.println("Some sound");
            }
        };
        myAnimal.makeSound();  // Output: Some sound

        Vehicle myVehicle = new Vehicle() {  // Anonymous class
            public void drive() {
                System.out.println("Driving...");
            }
        };
        myVehicle.drive();

        Vehicle2 myVehicle2 = () -> System.out.println("Driving...");
        myVehicle2.drive();
    }
}
