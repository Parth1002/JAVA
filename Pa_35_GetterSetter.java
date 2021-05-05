package com.company;

class mobile1{
    private int i;
    private String name;

    public void setI(int i) {
        this.i = i;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }
}
public class Pa_35_GetterSetter {
    public static void main(String[] args) {
        mobile1 parth=new mobile1();

//        parth.getI();
//        parth.getName();

        parth.setI(5);
        parth.setName("jayGoga");

        System.out.println(parth.getI());
        System.out.println(parth.getName());

    }
}
