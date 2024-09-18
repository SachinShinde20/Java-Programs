// Dynamic Size Array Example
// New Capacity = Current Capacity + (Current Capacity / 2) + 1 (First Default Capacity is 10)
// Not synchronized with threads; race conditions may occur
// For syncronization we use Vector

import java.util.ArrayList;
import java.util.List;

public class P1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        /*
         * ...................
         * Size Management
         * `````````````````
         */
        list.ensureCapacity(20); // Set minimum ArrayList capacity to 20
        list.trimToSize(); // Adjust capacity to the current size of the ArrayList

        /*
         * ...................
         * Add Block
         * `````````````````
         */
        list.add(9);
        list.add(17);
        list.add(22);
        list.add(3);
        list.add(41);
        list.add(39);
        list.add(25);
        list.add(2, 14); // Add 14 at index 2

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(88);
        l2.add(62);
        l2.add(74);
        list.add(3);

        list.addAll(l2); // Add all elements of l2 to list
        // list.addAll(1, l2); //We can add other collection also
        System.out.println("\nNew ArrayList is: " + list);

        /*
         * ...................
         * Remove Block
         * `````````````````
         */
        list.remove(3); // Remove element at index 3
        list.remove(Integer.valueOf(62)); // Remove first occurrence of 62
        System.out.println("3rd Set: " + list);

        list.removeIf(num -> num < 17); // Remove elements less than 17
        System.out.println("4th Set: " + list);

        list.removeAll(l2); // Remove all elements in l2 from list
        System.out.println("5th Set: " + list);

        /*
         * ...................
         * Size and Element Access
         * `````````````````
         */
        System.out.println("\nSize of ArrayList is: " + list.size());
        System.out.println("Element at index 2: " + list.get(2)); // Get element at index 2

        list.set(2, 93); // Replace element at index 2 with 93
        System.out.println(list);

        /*
         * ...................
         * Searching
         * `````````````````
         */
        System.out.println();
        System.out.println(list.indexOf(93)); // Return first occurrence of 93 from the start
        System.out.println(list.lastIndexOf(93)); // Return last occurrence of 93
        System.out.println(list.contains(93)); // Return true if 93 is present in the ArrayList

        /*
         * ...................
         * Other Methods
         * `````````````````
         */
        System.out.println();
        System.out.println(list.isEmpty()); // Print true if array is empty

        // Creates sublist withe gien elements
        List<Integer> l3 = list.subList(1, list.size() - 1);
        System.out.println("List No. 3: " + l3);

        list.clear();
        System.out.println("List: " + list);
    }
}
