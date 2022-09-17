package MY_Application;

public class Pa_28_MethodOverloding {
    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int x){
        System.out.println("I am 2nd methodoverloading :- " + x);
    }

    static void foo(int x,int y){

        System.out.println("I am 3nd methodoverloading :- " + x + "," + y);
    }
    public static void main(String[] args) {
        foo();
        foo(10);
        foo(45,55);
    }
}
