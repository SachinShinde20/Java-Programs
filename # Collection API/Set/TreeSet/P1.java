// Does not allow duplicate elements. 
// Deoes not have Indexes

import java.util.TreeSet;
import java.util.Iterator;
import java.util.ArrayList;

public class P1 {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();
        // Add
        set.add(101);
        set.add(200);
        set.add(150);
        set.add(90);
        set.add(75);
        set.add(20);

        System.out.println(set + ", Set Size: " + set.size());

        // Creating an iterator
        Iterator<Integer> it = set.iterator();
        System.out.println("\nThe iterator values are: ");
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

        // ForEach
        System.out.println("\n\nFor Each ");
        set.forEach(n -> {
            System.out.println("Number: " + n);
        });

        // Remove
        set.remove(90);
        System.out.println("\n(90) is Removed");

        // Contains
        System.out.println("Is Mohit Present: " + set.contains(90));

        // Clone
        System.out.println("\nClonning: ");
        @SuppressWarnings("unchecked")
        TreeSet<Integer> s2 = (TreeSet<Integer>) set.clone();
        System.out.println(s2);

        TreeSet<Integer> s3 = new TreeSet<>(set);
        System.out.println(s3);

        // Clear
        set.clear();
        System.out.println("\n" + set);

        // arraylist to TreeSet
        ArrayList<Integer> i = new ArrayList<>();
        i.add(11);
        i.add(33);
        i.add(33);
        i.add(22);
        TreeSet<Integer> hSet = new TreeSet<>(i);
        System.out.println("\nArrayList to TreeSet: " + hSet);

        System.out.println("\n");
        System.out.println("Lowest: " + set.first());
        System.out.println("Higher: " + set.last());
        System.out.println("Higher than 101: " + set.higher(101));
        System.out.println("Lower than 101: " + set.lower(101));
    }
}