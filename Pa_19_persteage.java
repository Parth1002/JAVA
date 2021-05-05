  package com.company;

 import java.util.Scanner;
 import java.util.*;

 public class Pa_19_persteage {
     public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);

         System.out.println("Enter sub1: ");
         int sub1= sc.nextInt();

         System.out.println("Enter sub2: ");
         int sub2= sc.nextInt();

         System.out.println("Enter Sub3: ");
         int sub3= sc.nextInt();

         System.out.println("Enter sub4: ");
         int sub4= sc.nextInt();

         System.out.println("Enter sub5: ");
         int sub5= sc.nextInt();

         float marks=sub1+sub2+sub3+sub4+sub5;
         float per=(marks)*100/500;

         System.out.println("Your perserteg: "+per+"%");
     }
 }
