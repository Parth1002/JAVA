import java.util.ArrayDeque;

public class Pa_58_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> pa1 = new ArrayDeque<>();

        // Add to ArrayDeque
        pa1.add(2);
        pa1.add(3);
        pa1.add(4);
        pa1.add(5);
        pa1.add(6);

        // Add to First ArrayDeque
        // pa1.addFirst(1);
        // pa1.offerFirst(10);

        // Add to Last ArrayDeque
        // pa1.addLast(5);
        // pa1.offerLast(10);

        // First in ArrayDeque View
        // System.out.println(pa1.getFirst());
        // System.out.println(pa1.peekFirst());

        // Last in ArrayDeque View
        // System.out.println(pa1.getLast());
        // System.out.println(pa1.peekLast());

        // Delete in First ArrayDeque
        // pa1.pollFirst(); //deletes 2
        // pa1.removeFirst(); // deletes 3

        // Delete in Last ArrayDeque
        // pa1.pollLast(); //deletes 6
        // pa1.removeLast(); //deletes 5

        // Last in ArrayDeque view
        // System.out.println(pa1.getLast());

        System.out.println(pa1);
    }
}
