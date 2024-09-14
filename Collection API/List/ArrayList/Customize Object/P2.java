import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class P2 {
    public static void main(String[] args) {

        ArrayList<Students> list = new ArrayList<>();

        list.add(new Students(72, "Shree", 99.99));
        list.add(new Students(20, "Om", 80.20));
        list.add(new Students(45, "Deva", 74.73));
        list.add(new Students(50, "Ritesh", 85.99));
        list.add(new Students(76, "Atharv", 55.43));
        list.add(new Students(55, "Sahil", 70.10));

        // Printing The List
        System.out.println("List: ");
        for (Students s : list) {
            System.out.println(s);
        }

        // Sort According to the marks
        Comparator<Students> com = new Comparator<Students>() {
            public int compare(Students o1, Students o2) {
                if (o1.rollNo > o2.rollNo)
                    return 1; // Swap
                else
                    return -1;
            }
        };

        Collections.sort(list, com);

        // Printing The List
        System.out.println("\nList after swap:");
        System.out.println("List: ");
        for (Students s : list) {
            System.out.println(s);
        }
    }
}
