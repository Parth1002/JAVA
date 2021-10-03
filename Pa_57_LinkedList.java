import java.util.LinkedList;

public class Pa_57_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> pa1 = new LinkedList<>();
        LinkedList<Integer> pa2 = new LinkedList<>();

        // Add Linklist
        pa1.add(2);
        pa1.add(8);
        pa1.add(7);
        pa1.add(2);
        pa1.add(4);

        pa2.add(52);
        pa2.add(58);
        pa2.add(57);
        pa2.add(58);
        pa2.add(54);

        // Add Last Linklist
        // pa2.addLast(25);

        // First Last Linklist
        // pa2.addFirst(788);

        // Remove Linklist
        // pa1.remove(3);

        // Value true & false Linklist
        // System.out.println(pa1.contains(7));

        // Clear Linklist
        // pa1.clear();


        // AddAll Linklist
        // pa1.addAll(5,pa2);
        
        //Indexof Linklist
        // System.out.println(pa2.indexOf(54));

        //lastOf Linklist
        // System.out.println(pa2.lastIndexOf(58));

        System.out.println(pa1+" "+pa2);
  
    }
}
