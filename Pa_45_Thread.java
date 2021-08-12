package com.example.jaygoga;

class Mythared1 extends Thread{
    @Override
    public void run() {
        int a=0;
        while (a<20000){
            System.out.println("That is cooking Running");
            System.out.println("This is Thrad1");
            a++;
        }
    }
}
class Mythared2 extends Thread{
    @Override
    public void run() {
        int a=0;
        while (a<20000){
            System.out.println("That is chating Running");
            System.out.println("This is Thrad2");
            a++;
        }
    }
}
public class Pa_45_Thread{
    public static void main(String[] args) {
        Mythared1 t1= new Mythared1();
        Mythared2 t2= new Mythared2();

        t1.start();
        t2.start();

    }
}
