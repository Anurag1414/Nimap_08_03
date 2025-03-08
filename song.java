package Nimap_08_03;

public interface song {

    void playing();

    default void stop() {
        System.out.println("Song was stopped");
    }
}
