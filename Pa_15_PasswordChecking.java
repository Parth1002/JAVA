  package com.company;

 import java.util.Scanner;

 public class Pa_15_PasswordChecking {
     public static void main(String[] args) {

         System.out.print("Enter password:");
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=12345;

         if(a==b){
             System.out.println("Your password ok");
         }else{
             System.out.println("Your password wrong");
         }
     }
 }
