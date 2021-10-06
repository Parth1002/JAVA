import java.util.HashSet;

public class Pa_59_HashSet{
    public static void main(String[] args) {
      HashSet<Integer> pa1 = new HashSet<>(6,0.5f);
      HashSet<Integer> pa2 = new HashSet<>();

        // Add HashSet
        /* Notice
          -->Duplicate Value Not Run
        */
        pa1.add(2);
        pa1.add(8);
        pa1.add(7);
        pa1.add(2);
        pa1.add(4);

        System.out.println(pa1+" "+pa2);

    }
}
