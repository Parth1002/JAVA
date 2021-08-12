package com.example.jaygoga;

/* inheritance java Best Example
    -------------
*   Example
*   --------------
*   Grandfather --> father --> child
*  */

class Base {
    int x;

    public int getX() {
        System.out.println("I am parth");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Drived extends Base{
    int y;

    public int getY() {
        System.out.println("I am Driverd");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Pa_37_Inheritance {
    public static void main(String[] args)
    {
        /* Base class to printed */
//        Base A=new Base();
//        A.setX(5);
//        System.out.println(A.getX());
        /* Base class to printed */

        /* Drived class to printed */
//        Drived d=new Drived();
//        d.setY(9);
//        System.out.println(d.getY());
        /* Drived class to printed */


         /* Drived class to Base class printed */
            Drived m=new Drived();
            m.setX(10);
            System.out.println(m.getX());
        /* Drived class to Base class printed */

    }

}
