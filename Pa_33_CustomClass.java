package com.company;

class car{
    int id;
    String name;
}
public class Pa_33_CustomClass {
    public static void main(String[] args) {
        car parth =new car();

        parth.id=22;
        parth.name="codewithparth";

        System.out.println("Your id:-"+parth.id);
        System.out.println("Your name:-"+parth.name);

    }
}