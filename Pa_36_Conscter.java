package com.company;

class mobile4{
    private int i;
    private String name;

//    public mobile4(){
//        i=1;
//        name="Enter Your Name";
//    }
    public mobile4(int myid,String myname){
        i=myid;
        name=myname;
    }
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
public class Pa_36_Conscter {
    public static void main(String[] args) {
//        mobile4 parth=new mobile4();

        mobile4 parth=new mobile4(2,"parth");

        System.out.println(parth.getI());
        System.out.println(parth.getName());
    }
}
