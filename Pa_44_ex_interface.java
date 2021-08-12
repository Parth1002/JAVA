package com.example.jaygoga;

interface cars{
    void Break();
    void Speed();
    void Horn();
}
class Honda implements cars{
    public void Break(){
        System.out.println("Break");
    }
    public void Speed(){
        System.out.println("speed");
    }
    public void Horn(){
        System.out.println("Horn");
    }
}
public class Pa_44_ex_interface {
    public static void main(String[] args) {
        cars a=new Honda();
        a.Break();
    }
}
