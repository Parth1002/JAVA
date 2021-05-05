package com.company;

 import java.util.Scanner;

public class Pa_11_ScannerBasic {
    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);

        System.out.print("Enter No:-");
        int b = sc.nextInt();
        float c = sc.nextFloat();
        String d = sc.nextLine();
        char e=sc.next().charAt(4);

        System.out.println("Your int number:-"+b);
        System.out.println("Your Float number:-"+c);
        System.out.println("Your String number:-"+d);
        System.out.println("Your char number:-"+e);


    }
}
