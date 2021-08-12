package com.example.jaygoga;

/*
*  child --> father
*
* abscrect class declwer parent class permisan in child class
* Example ==> khayali pulav */

abstract class father{
    public father(){
        System.out.println("i am parth");
    }
    public void H1(){
        System.out.println("hello world");
    }
    abstract public void greet();
}
class Child extends father{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}


public class Pa_42_abstract {
    public static void main(String[] args) {
        // father b = new father();--> error

        Child a=new Child();
        a.greet();
    }
}
