//  LinkedList
// Doubly-linked list implementation of the List and Deque interfaces. Implements all optional list operations, and permits all elements (including null).

import java.util.Iterator;
import java.util.LinkedList;

public class P1 {
    public static void main(String[] args) {
        LinkedList<String> LList = new LinkedList<>();

        // Add
        LList.add("Raju");
        LList.add("Mohit");
        LList.add("Sam");
        LList.add("Arvind");
        LList.add("Kishor");
        LList.add(2, "Viraj");
        System.out.println(LList);

        // Removed
        LList.remove(2);
        System.out.println("\nLList After Removing Elememnt at Index 2: \n" + LList);

        System.out.println("\nCapacity: " + LList.size());
        System.out.println("Element at 3 is: " + LList.get(3));

        // Clonning
        System.out.println("\nClonning:");
        @SuppressWarnings("unchecked")
        LinkedList<String> l = (LinkedList<String>) LList.clone();
        System.out.println(l);

        LinkedList<String> l2 = new LinkedList<>(l);
        System.out.println(l2);

        // Contains
        System.out.println("\nCheck Wether LList Contains Rahul or not: " + LList.contains("Rahul"));

        // Iterator
        System.out.println("\nIterator: ");
        Iterator<String> it = LList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

        System.out.println("\nDescending Iterator");
        Iterator<String> it2 = LList.descendingIterator();
        while (it2.hasNext()) {
            System.out.print(it2.next() + ", ");
        }

        // ForEach
        System.out.println("\n\nUsing For Each");
        LList.forEach(n -> {
            System.out.println("Name: " + n);
        });
    }
}
