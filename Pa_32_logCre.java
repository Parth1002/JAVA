package com.company;

 import java.util.Scanner;

 public class Pa_32_logCre {
     static void login(){
         System.out.println("login");
     };
     static void create(){
         System.out.println("create");
     };
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter Value 1 & 2:");
         int ch=sc.nextInt();

         switch (ch) {
             case 1:
                 login();
                 break;
        
             case 2:
                 create();
                 break;
                
             default:
                 break;
         }
     }
 }
