package MY_Application;

public class Pa_29_VarArgs {
    /**
     * varargs function is the total function sum one method
     */
    static int sum(int ...arr){
        // Available int [] arr
        int result = 0;
        for (int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome varArgs tutorial");
        System.out.println("The sum of 4 and 5 :- " + sum(4,5));
        System.out.println("The sum of 4 , 3 and 5 :- " + sum(4,3,5));
        System.out.println("The sum of 4 , 3 , 9 and 5 :- " + sum(4,3,9,5));
    }
}
