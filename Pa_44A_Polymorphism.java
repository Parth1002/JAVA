package MY_Application;

/**
 * PolymorPhism in java
 *     > camera only for use in method
 *     > Wifi is not use in method
 */
interface Mycamera{
    void recording();
    void tasksnap();
}

interface Mywifi{
    void connectNetwork();
    void Gps();
}

class MySmartPhone implements Mycamera,Mywifi{
    public void recording(){
        System.out.println("Recording....");
    }
    public void tasksnap(){
        System.out.println("Tasksnap......");
    }
    public void connectNetwork(){
        System.out.println("Connecting Network.....");
    }
    public void Gps(){
        System.out.println("Gps........");
    }
}

public class Pa_44A_Polymorphism {
    public static void main(String[] args) {
        Mycamera cam = new MySmartPhone(); // This is a SmartPhone but, use it camera

        // cam.connectNetwork(); // --> Not Allowed
        // cam.Gps(); // --> Not Allowed
        cam.recording(); // --> Allowed
    }
}
