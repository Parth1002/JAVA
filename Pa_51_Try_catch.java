// package com.example.jaygoga;

public class Pa_51_Try_catch{
    public static void main(String[] args) {
        int a = 1000;
        int b = 0;

        // without try
        // int c=a/b;
        // System.out.println("The result:-"+c);

        // with Try
        try {
            int c = a / b;
            System.out.println("The result:-" + c);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("End of try function");
    }
}
