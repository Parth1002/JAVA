package com.company;

// import java.util.Scanner;

public class Pa_27_Method {
//    void Method
    static void login(int x,int y){
        int z;
        z=x+y;
        System.out.println(z);
    }



//   static Method
//    static int login(int x,int y){
//        int z;
//        z=x+y;
//     // System.out.println(sum);
//        return z;
//    }



//    Non-static Method
//     int login(int x,int y){
//         int z;
//        z=x+y;
//
//         return z;
//    }


    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);

        int a,b;
        // int c;
        a=4;
        b=5;

//    void Method
        login(a,b);

//    static Method
//        c=login(a,b);

//    Non-static Method
//         Pa_27_Method obj=new Pa_27_Method();
//         c=obj.login(a,b);

//        System.out.println(c);
    }
}
