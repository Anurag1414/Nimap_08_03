package Nimap_08_03;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main with String[] args");
        main(5);
    }

    public static void main(int num) {
        System.out.println("Overloaded main with int: " + num);
    }
}
