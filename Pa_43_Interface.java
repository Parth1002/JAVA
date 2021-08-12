package com.example.jaygoga;

interface Bicycle{
    void Break(int decrement);
    void Speed(int increment);
}
interface BlowHorn{
    void BlowHorn();
}
class Avoincycle implements Bicycle,BlowHorn{
     public void BlowHorn() {
        System.out.println("pee poo poo....");
    }

    @Override
    public void Break(int decrement) {
        System.out.println("Apply Break...");
    }

    @Override
    public void Speed(int increment) {
        System.out.println("Apply speed...");
    }
}
public class Pa_43_Interface {
    public static void main(String[] args) {
//        Bicycle a=new Avoincycle();
//        a.Break(1425);
//        a.Speed(1425);
        BlowHorn b=new Avoincycle();
        b.BlowHorn();

    }
}
