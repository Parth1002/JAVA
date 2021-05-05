  package com.company;

 import java.util.Scanner;

 public class Pa_14_Gadiya {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.print("Enter Your value:");
         int b= sc.nextInt();
         int a;

         for (a=1;a<=10;a++){
             System.out.println("\t\t"+b+" * "+a+" = "+b*a);
         }

     }
 }
