package MY_Application;

public class Pa_70_Recursion {
    public static void Printnum(int n) {
        // BASE CASE
        if (n == 0) {
            return;
        }
        // BASE CASE
        System.out.println(n);
        Printnum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        Printnum(n);
    }
}
