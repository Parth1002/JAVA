// package com.example.jaygoga;

class Mythared11 extends Thread{
    public Mythared11(String name){
        super(name);
    }
    @Override
    public void run() {
        // System.out.println("This is Thrad1");
    }
}
public class Pa_47_Thread_Constructor {
    public static void main(String[] args) {
        Mythared11 T1= new Mythared11("jay_goga");
        Mythared11 T2= new Mythared11("jay_umiya");

        T1.start();
        T2.start();

        System.out.println("The Thread Constructor  :-"+T1.getId());
        System.out.println("The Thread Constructor :-"+T1.getName());
        System.out.println("The Thread Constructor :-"+T2.getId());
        System.out.println("The Thread Constructor :-"+T2.getName());
    }
}
