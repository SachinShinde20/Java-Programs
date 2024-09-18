import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx3 {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>(7);
        l1.add(8);
        l1.add(0);
        l1.add(3);
        l1.add(9);
        l1.add(0);
        l1.add(2);
        l1.add(7);
        l1.add(0);

        System.out.println(l1);

        // Returns true if this list contains the specified element.
        System.out.println(l1.contains(3));
        System.out.println(l1.contains(1));

        // Print str
        System.out.println("\nUsing for Each:");
        l1.forEach(str -> System.out.println(str));

        // Set Capacity as
        l1.trimToSize();

        // Print Even or odd
        System.out.println("\nUsing for Each:");
        l1.forEach(num -> {
            if (num % 2 == 0)
                System.out.println("Even: " + num);
            else
                System.out.println("Odd " + num);
        });

        // Sort - (Collection Requared)
        System.out.println("\nSorted: ");
        Collections.sort(l1);
        System.out.println("Ascending Order: " + l1);

        // Reverse Order
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Descending Order: " + l1);

        // Remove perticular number
        System.out.println("\nRemove 0 ");
        l1.remove(Integer.valueOf(0));
        System.out.println("Now Array: " + l1);

        // Remove all Zeros
        System.out.println("Remove all 0");
        l1.removeIf(n -> n == 0);
        System.out.println("Now Array: " + l1);

        // Iterator
        Iterator<Integer> itObj = l1.iterator();
        while (itObj.hasNext()) {
            System.out.println(itObj.next());
        }

        // Remove all
        ArrayList<Integer> l2 = new ArrayList<>(7);
        l2.add(8);
        l2.add(3);
        l2.add(9);
        l1.removeAll(l2);
        System.out.println("\nAfter Remove all: " + l1);
    }
}
