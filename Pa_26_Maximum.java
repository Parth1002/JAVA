  package com.company;

 import java.util.Scanner;

 public class Pa_26_Maximum {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         int a,b,c;

         System.out.println("Enter No1:");
         a= sc.nextInt();

         System.out.println("Enter No2:");
         b=sc.nextInt();

         System.out.println("Enter No3:");
         c=sc.nextInt();

         if(a>b){
             System.out.println("Your max No"+a);
         }else if(b>c){
             System.out.println("Your max No"+b);
         }else{
             System.out.println("Your max No"+c);
         }

     }
 }
