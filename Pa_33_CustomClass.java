package com.company;

class car {
    int id;
    String name;

    public void PrintDetail(){
        System.out.println("Your id :- " + id);
        System.out.println("Your name :- " + name);
    }
}

public class Pa_33_CustomClass {
    public static void main(String[] args) {
        car parth = new car(); // OOP create

        // setting Attributa
        parth.id = 22;
        parth.name = "codewithparth";

        // print in Detail
        parth.PrintDetail();

        // print in Detail
        // System.out.println("Your id:-" + parth.id);
        // System.out.println("Your name:-" + parth.name);

    }
}
