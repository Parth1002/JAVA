// package com.company;

public class Pa_55_Finally{
    public static void main(String[] args) {

        // Error Finally
        try{
            System.out.println(50/0);
        }
        finally {
            System.out.println("Yes this is False finally");
        }

        // True Finally 

        // try{
        //     System.out.println(50/3);
        // }
        // finally {
        //     System.out.println("Yes this is True finally");
        // }
    }
}
