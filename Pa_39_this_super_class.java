package com.example.jaygoga;

/*   this & super class keyworld use */

class First{
    int v;
    First(){
        System.out.println("First class");
    }
    First(int y){
        this.v = y;
        System.out.println("this");
    }
}
class Second extends First{
    Second(int x){
        super(x);
        System.out.println("Secound class");
    }
}
public class Pa_39_this_super_class {
    public static void main(String[] args) {
        Second z=new Second(4);

    }
}
