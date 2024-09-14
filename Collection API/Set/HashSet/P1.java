// Does not allow duplicate elements. 
// Deoes not have Indexes

import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class P1 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        // Add
        set.add("Rahul");
        set.add("Sam");
        set.add("Virju");
        set.add("Arthur");
        set.add("Mohit");
        set.add(null);
        // Duplicated
        set.add("Mohit");
        set.add("Mohit");

        System.out.println(set + ", Set Size: " + set.size());

        // Creating an iterator
        Iterator<String> it = set.iterator();
        System.out.println("\nThe iterator values are: ");
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

        // ForEach
        System.out.println("\n\nFor Each ");
        set.forEach(n -> {
            System.out.println("Name: " + n);
        });

        // Remove
        set.remove("Mohit");
        System.out.println("\nMohit is Removed");

        // Contains
        System.out.println("Is Mohit Present: " + set.contains("Mohit"));

        // Clone
        System.out.println("\nClonning: ");
        HashSet<String> s2 = (HashSet<String>) set.clone();
        System.out.println(s2);

        HashSet<String> s3 = new HashSet<>(set);
        System.out.println(s3);

        // Clear
        set.clear();
        System.out.println("\n" + set);

        // arraylist to hashset
        ArrayList<Integer> i = new ArrayList<>();
        i.add(11);
        i.add(33);
        i.add(33);
        i.add(22);
        HashSet<Integer> hSet = new HashSet<>(i);
        System.out.println("\nArrayList to HashSet: " + hSet);
    }
}