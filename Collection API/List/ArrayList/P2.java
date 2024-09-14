import java.util.ArrayList;
import java.util.Iterator;

public class P2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(17);
        list.add(22);
        list.add(41);
        list.add(39);
        list.add(25);
        System.out.println("ArrayList: " + list);

        // Iterator (Requir: java.util.Iterator;)
        System.out.println("\nArraylist using Iterator: ");
        Iterator<Integer> itObj = list.iterator();
        while (itObj.hasNext()) {
            System.out.println(itObj.next());
        }

        // For Each
        System.out.println("\nFor Each: ");
        list.forEach(num -> {
            if (num % 2 == 0)
                System.out.println(num + " is Even");
            else
                System.out.println(num + " is Odd");
        });

        /*
         * ------------
         * Clonning
         * -----------
         */
        // Unsafe Methos -> Result in Warning
        ArrayList<Integer> l2;
        l2 = (ArrayList<Integer>) list.clone();
        System.out.println("\nCloned List L2: \n" + l2);

        // Safe Method
        ArrayList<Integer> l3 = new ArrayList<>(list);
        System.out.println("\nCloned List L3: \n" + l3);

        // Array to ArrayList
        int[] arr1 = { 11, 18, 13, 15, 11 };
        ArrayList<Integer> l4 = new ArrayList<>();
        for (int i : arr1) {
            l4.add(i);
        }
        System.out.println("\nList 4: " + l4);

        /*
         * ------------
         * ArrayList to Array
         * -----------
         */
        Object[] arr2 = l4.toArray();
        System.out.println("\nArray to Object arr2:");
        for (Object o : arr2) {
            System.out.print(o + ", ");
        }

        // Inside the toArray method, it checks the size of the provided array.
        // Since the size is 0, it allocates a new array of the required size to hold
        // all elements of the ArrayList.
        Integer[] arr3 = l4.toArray(new Integer[0]);

        System.out.println("\nArray to Object arr3:");
        for (int o : arr3) {
            System.out.print(o + ", ");
        }
    }
}
