// package com.example.jaygoga;

class Mythr11 extends Thread {
    public Mythr11(String name) {
        super(name);
    }

    @Override
    public void run() {
        int a = 0;
        while (a < 2000) {
            System.out.println("Thank You:-" + getName());
            a++;
        }
    }
}

public class Pa_48_Thread_PRIORITY {
    public static void main(String[] args) {
        Mythr11 T7 = new Mythr11("Jay_goga(MIN PPRIORITY)");
        Mythr11 T8 = new Mythr11("Jay_umiya(MAX PRIORITY)");
        Mythr11 T9 = new Mythr11("Jay_veer");
        Mythr11 T10 = new Mythr11("patidar");
        Mythr11 T11 = new Mythr11("sardar");

        // set parity
        T8.setPriority(Thread.MAX_PRIORITY);
        T7.setPriority(Thread.MIN_PRIORITY);

        T7.start();
        T8.start();
        T9.start();
        T10.start();
        T11.start();
    }
}
