package com.company;


public class Pa_28_MethodOverloding {
    // one function in java
    static int log(int a,int b,int ...arr){
        return a+b;
    }
    public static void main(String[] args) {
        int x,y;
        x=5;
        y=6;

       int b= log(x,y);

        System.out.println(b);
    }
}
