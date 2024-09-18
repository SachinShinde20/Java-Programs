// Does not allow duplicate elements. 
// Deoes not have Indexes

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class P1 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
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
        System.out.println("Is (90) Present: " + set.contains(90));

        // Clone
        System.out.println("\nClonning: ");
        @SuppressWarnings("unchecked")
        LinkedHashSet<Integer> s2 = (LinkedHashSet<Integer>) set.clone();
        System.out.println(s2);

        LinkedHashSet<Integer> s3 = new LinkedHashSet<>(set);
        System.out.println(s3);

        // Clear
        set.clear();
        System.out.println("\n" + set);

        // arraylist to LinkedHashSet
        ArrayList<Integer> i = new ArrayList<>();
        i.add(11);
        i.add(33);
        i.add(33);
        i.add(22);
        LinkedHashSet<Integer> hSet = new LinkedHashSet<>(i);
        System.out.println("\nLinkedHashSet to ArrayList : " + hSet);
    }
}