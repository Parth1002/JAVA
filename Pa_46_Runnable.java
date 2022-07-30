package com.example.jaygoga;

class MytharedRunnable1 implements Runnable{
    @Override
    public void run() {
        int a=0;
        while (a<20000){
            System.out.println("That is cooking Running");
            System.out.println("This is MytharedRunnable1");
            a++;
        }
    }
}
class MytharedRunnable2 implements Runnable{
    @Override
    public void run() {
        int a=0;
        while (a<20000){
            System.out.println("That is chating Running");
            System.out.println("This is MytharedRunnable2");
            a++;
        }
    }
}
public class Pa_46_Runnable{
    public static void main(String[] args) {
        MytharedRunnable1 bullet1= new MytharedRunnable1();
        Thread gun1 = new Thread(bullet1);

        MytharedRunnable2 bullet2= new MytharedRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
