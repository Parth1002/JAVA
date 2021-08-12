package com.example.jaygoga;

/* METHOD SEM IN CLASS IN TO
*  EXAMPLE-->@Override */

class parth{
    public  parth(){
        System.out.println("math1");
    }
    public void math2(){
        System.out.println("");
    }
}
class hello extends parth{
    @Override
    public void math2(){
        System.out.println("hello math2");
    }
}
public class Pa_40_method_overiding {
    public static void main(String[] args) {
        hello a= new hello();
    }
}
