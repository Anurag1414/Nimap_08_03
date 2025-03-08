package Nimap_08_03;

public interface camera {
    void quality();
    default void click(){
        System.out.println("Photo clicked");
    }
}
