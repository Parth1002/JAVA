import java.util.Scanner;

// package com.example.jaygoga;

public class Pa_50_ErrorDemo {
    public static void main(String[] args) {

        // SYNTEX ERROR
        // int a = 4 //simicolon error
        // b = 5; //non decration

        // LOGICAL ERROR
        System.out.println("2");
        for (int a = 0; a < 5; a++) {
            System.out.println(2 * a + 1);
        }

        // RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Your Value:-" + 1000 / k);
        sc.close();
    }

}
