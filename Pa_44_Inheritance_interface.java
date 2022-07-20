package MY_Application;

/**
 * Inheritance interface
 */

interface fathar{
    void math1();
    void math2();
}
interface child extends fathar{
    void math3();
    void math4();
}
class Simple implements fathar{
    public void math1(){
        System.out.println("math1");
    }
    public void math2(){
        System.out.println("math2");
    }
    public void math3(){
        System.out.println("math3");
    }
    public void math4(){
        System.out.println("math4");
    }
}
public class Pa_44_Inheritance_interface {
    public static void main(String[] args) {
       Simple A = new Simple();

       A.math1();
       A.math2();
       A.math3();
       A.math4();

    }
}
