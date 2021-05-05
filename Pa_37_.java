package com.company;


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

public class Pa_37_ {
    public static void main(String[] args)
    {

    }

}