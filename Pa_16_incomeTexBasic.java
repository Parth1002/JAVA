  package com.company;

 import java.util.Scanner;

 public class Pa_16_incomeTexBasic {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.println("===============================");
         System.out.println("1. income 250000 0%");
         System.out.println("2. income 250000 to 500000");
         System.out.println("3. income 500000 to 100000000");
         System.out.println("4. income 100000000");
         System.out.println("5. Exit");
         System.out.println("===============================");
         System.out.print("Enter Choice no:");
         int ch= sc.nextInt();

         switch (ch){
             case 1:
                 math();//0%
                 break;
             case 2:
                 h1();//5%
                 break;
             case 3:
                 h2();//10%
                 break;
             case 4:
                 h3();//unlimited

             default:
                 System.out.println("Exit");
                 break;
         }
     }


     private static void math(){
         Scanner pa=new Scanner(System.in);

         System.out.print("Enter value: ");
         int a= pa.nextInt();
         int b=250000;


         if(a==b){
             System.out.println("Your return 0%");
         }
     }
     private static void h1(){
         Scanner pa=new Scanner(System.in);

         System.out.print("Enter value: ");
         int a= pa.nextInt();
         int c=250000;

         if(a>=c){
             a=a*5/100;
             System.out.println("Your return 5% :"+a);
         }else {
             System.out.println("Your value Wrong");
         }
     }
     private static void h2(){
         Scanner pa=new Scanner(System.in);

         System.out.print("Enter value: ");
         int a= pa.nextInt();
         int c=500000;

         if(a>=c){
             a=a*10/100;
             System.out.println("Your return 10% :"+a);
         }else {
             System.out.println("Your value Wrong");
         }
     }
     private static void h3() {
         Scanner pa=new Scanner(System.in);

         System.out.print("Enter value: ");
         int a= pa.nextInt();
         int c=100000000;

         if(a>=c){
             a=a*20/100;
             System.out.println("Your return 20% :"+a);
         }else {
             System.out.println("Your value Wrong");
         }
     }
 }
