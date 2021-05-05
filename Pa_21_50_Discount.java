  package com.company;

 import java.util.Scanner;

 public class Pa_21_50_Discount {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.print("Enter Prise No :");
         int pri=sc.nextInt();

         int pro= pri/2;

         System.out.println("Your prise is 50% discount :"+pro);
     }
 }
