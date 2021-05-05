  package com.company;

  import java.util.Scanner;

 public class Pa_13_AkeBke {
     public static void main(String[] args) {

          Scanner parth=new Scanner(System.in);

         System.out.print("Enter choice no:");
          int ch=parth.nextInt();

          switch (ch)
         {
             case 1:
                 System.out.println("1");
                 ake();
                 break;
             case 2:
                 bke();
                 System.out.println("2");
                 break;
             default:
                 System.out.println("exit");
                 break;
         }

     }

     private static void ake() {
         Scanner sc=new Scanner(System.in);

         System.out.print("Enter Ake:");
         int a= sc.nextInt();
         int b,c;

         for (b=0;b<=a;b++){
             b=b+1;
             System.out.println("Your ake :"+b);
         }

     }
     private static void bke(){
         Scanner scr=new Scanner(System.in);

         System.out.print("Your bke:");
         int a= scr.nextInt();
         int b,c;

         for (b=1;b<=a;b++){
             b=b+1;
             System.out.println("Your ake :"+b);
         }
     }

 }
