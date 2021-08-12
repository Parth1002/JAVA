package com.example.jaygoga;

/* Conscter in inheritance java
    -------------
*   Example
*   --------------
*   Grandfather --> father --> child
*  */
class Base1{

    Base1(){
        System.out.println("I am Base class");
    }
    Base1(int x){
        System.out.println("I am Base overloading class : " +x);
    }
}
class Drived1 extends Base1{

    Drived1(){
        // super(4);
        System.out.println("I am Drived Class");
    }

    Drived1(int x,int y){
        super(x);
        System.out.println("I am Drived overloading class : "+ y);
    }
}
public class Pa_38_Conscter_in_inheritance{
    public static void main(String[] args) {
        Base1 A=new Base1();
//        Drived1 A=new Drived1();
//        Base1 A=new Base1(45);
//        Drived1 A=new Drived1(12,45);
    }
}
