import java.util.ArrayList;
import java.util.Collections;

public class P3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(17);
        list.add(22);
        list.add(41);
        list.add(39);
        list.add(25);
        System.out.println("ArrayList: " + list);

        /*
         * ...................
         * Comparator
         * By Default
         * `````````````````
         */
        Collections.sort(list);
        System.out.println("\nArrayList After Sort: \n" + list);

        Collections.sort(list.reversed());
        System.out.println("\nArrayList After Sort: \n" + list);
    }
}
