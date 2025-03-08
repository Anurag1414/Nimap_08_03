package Nimap_08_03;

public interface video {

    void playing();

    default void stop() {
        System.out.println("Stop playing");
    }
}
