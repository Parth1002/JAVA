  package com.company;

 import java.util.Scanner;

 public class Pa_25_UserNumber {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.print("ENTER NO1:-");
         int a= sc.nextInt();

         System.out.print("ENTER NO2:-");
         int b= sc.nextInt();

         while(a<b) {
             for (a = a; a <= b; a++) {
                 System.out.println("Your number  :--  "+a);
             }
             b++;
         }
         if(a>b) {
             System.out.println("Your no1 is large");
         }else {
             System.out.println("");
         }
     }
 }