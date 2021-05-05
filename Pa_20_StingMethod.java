  package com.company;


 import java.util.Arrays;

 public class Pa_20_StingMethod {
     public static void main(String[] args) {
         String name="Patidar";
         String name1="goga";
         String name2="";
         String name3="     jayveer     ";

         System.out.println(name.length());
         System.out.println(name.toUpperCase());
         System.out.println(name.toLowerCase());
         System.out.println(name.charAt(5));
         System.out.println(name.getBytes());
         System.out.println(name.chars());
         System.out.println(name.concat(name1));
         System.out.println(name1.compareTo(name));
         System.out.println(name.codePointAt(1));
         System.out.println(name.codePointCount(2,4));
         System.out.println(name.codePointBefore(4));
         System.out.println(name3.trim());
         System.out.println(name.matches("Patidar"));
         System.out.println(name.equals(name1));
         System.out.println(name.intern());
         System.out.println(name2.isEmpty());
         System.out.println(name.hashCode());
         System.out.println(name.replaceAll(name,name1));
         System.out.println(name.replace(name,name1));
         System.out.println(name.indexOf(name2));
         System.out.println(name.replaceFirst(name2,name));
         System.out.println(name.split(name1));
         System.out.println(name.substring(2,5));
         System.out.println(name.toCharArray());
         System.out.println(name.toString());

     }

 }
