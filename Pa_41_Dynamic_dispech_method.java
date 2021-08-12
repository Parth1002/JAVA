package com.example.jaygoga;

 /* SEM CLASS in to first class decleration*/

class phone{
    public void one(){
        System.out.println("HELLO WORLD! ONE");
    }
    public void name(){
        System.out.println("HELLO WORLD! NAME");
    }
}
class smartphone extends phone{
    public void two(){
        System.out.println("HELLO WORLD! TWO");
    }
    public void name(){
        System.out.println("HELLO WORLD! NAME2");
    }
}
public class Pa_41_Dynamic_dispech_method {
    public static void main(String[] args) {
        // phone a = new phone();    // Allowed
        // smartphone a = new smartphone();  // Allowed
        // a.name();

        phone a = new smartphone();
        // smartphone a = new phone(); //NOT Allowed
        a.name();


    }
}
