package Nimap_08_03;
public class mobile implements song, video, camera {
    @Override
    public void quality() {
        System.out.println("Camera quality is 64 pixel");
    }

    @Override
    public void click() {
        System.out.println("Click Click");
    }

    @Override
    public void playing() {
        System.out.println("Naam jalebi Bai");
    }

    @Override
    public void stop() {
        System.out.println("Stop playing Song");
    }


    public static void main(String[] args) {
        mobile m= new mobile();
        m.stop();
        m.playing();
        m.click();
        m.stop();
    }
}
