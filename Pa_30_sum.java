package com.company;
 import java.util.Scanner;

 public class Pa_30_sum{
     static int sum(int a,int b){
         return a+b;
     };
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.print("Enter no1:-");
         int x=sc.nextInt();

         System.out.print("Enter no2:-");
         int y=sc.nextInt();


         float z=sum(x,y);
         System.out.println("Your sum value-"+z);
     }
 }