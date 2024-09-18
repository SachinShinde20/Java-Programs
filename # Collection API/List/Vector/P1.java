// Vector is inbuild Syncronized

import java.util.Iterator;
import java.util.Vector;

public class P1 {
    public static void main(String[] args) {
        Vector<Integer> VList = new Vector<>();

        // Add
        VList.add(10);
        VList.add(15);
        VList.add(20);
        VList.add(25);
        VList.add(30);
        VList.add(2, 17);
        System.out.println(VList);

        // Removed
        VList.remove(2);
        System.out.println("\nVList After Removing Elememnt at Index 2: \n" + VList);

        System.out.println("\nCapacity: " + VList.capacity());
        System.out.println("Element at 3 is: " + VList.elementAt(3));

        // Clonning
        Vector<Integer> v = (Vector<Integer>) VList.clone();
        System.out.println("\nCloned Vector is: " + v);

        Vector<Integer> v2 = new Vector<>(v);
        System.out.println("New Cloned Vector is: " + v2);

        // Contains
        System.out.println("\nCheck Wether VList Contains 20 or not: " + VList.contains(20));

        // Iterator
        System.out.println("\nIterator");
        Iterator<Integer> it = v2.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

        // ForEach
        System.out.println("\n\nUsing For Each");
        v2.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(" Even " + n);
            else
                System.out.println(" Odd " + n);
        });
    }
}
