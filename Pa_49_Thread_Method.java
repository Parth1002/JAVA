// package com.example.jaygoga;

class Mythr101 extends Thread {

    public void run() {
        int a = 0;
        while (a < 2000) {
            System.out.println("Thank You MyThr101:-");
            a++;
        }
    }
}

class Mythr102 extends Thread {

    public void run() {
        int a = 0;
        while (a < 2000) {
            System.out.println("Thank You MyThr102:-");
            // sleep method
            // try {
            //     Thread.sleep(455);
            // } catch (Exception e) {
            //     System.out.println(e);
            // }
            // sleep method
            a++;
        }
    }
}

public class Pa_49_Thread_Method {
    public static void main(String[] args) {
        Mythr101 Z1 = new Mythr101();
        Mythr102 Z2 = new Mythr102();

        Z1.start();
        Z2.start();

        // join set method
        // try {
        //     Z1.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // join set method

    }
}
