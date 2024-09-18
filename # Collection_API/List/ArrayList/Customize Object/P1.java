import java.util.ArrayList;
import java.util.Iterator;

public class P1 {
    public static void main(String[] args) {

        ArrayList<Students> list = new ArrayList<>();
        list.add(new Students(72, "Shree", 99.99));
        list.add(new Students(20, "Om", 80.20));
        list.add(new Students(46, "Deva", 74.73));
        list.add(new Students(50, "Ritesh", 85.99));
        list.add(new Students(76, "Atharv", 55.43));

        // Add
        System.out.println("\n*Students are: ");
        list.add(new Students(55, "Sahil", 70.10));
        for (Students s : list) {
            System.out.println(s);
        }

        // Remove
        System.out.println("\n*Student's Marks less than 60 are removed: ");
        list.removeIf(s -> s.marks < 60);
        for (Students s : list) {
            System.out.println(s);
        }

        // Get
        System.out.println("\n*Get: ");
        System.out.println(list.get(3));

        // Set
        System.out.println("\n*Set: ");
        list.set(3, new Students(50, "Ritesh", 87.99));
        for (Students s : list) {
            System.out.println(s);
        }

        // For Each
        System.out.println("\n*For Each:");
        list.forEach(s -> {
            System.out.println("Name: " + s.name + ", Roll: " + s.rollNo);
        });

        // Get Student with more than 80 Marks
        System.out.println("\n*For Each to get Student with 80 Marks:");
        list.forEach(s -> {
            if (s.marks > 80) {
                System.out.println(s.name);
            }
        });

        // Iterator
        System.out.println("\n*Iterator: ");
        Iterator<Students> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
