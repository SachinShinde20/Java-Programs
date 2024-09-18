import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.Iterator;

public class P2 {
    public static void main(String[] args) {

        Set<Emp> s = Collections.synchronizedSet(new HashSet<>());
        // Add
        s.add(new Emp(101, "Kiran"));
        s.add(new Emp(102, "Sam"));
        s.add(new Emp(103, "Viraj"));
        s.add(new Emp(104, "Amrit"));

        s.add(new Emp(111, "Revan"));
        s.add(new Emp(111, "Revan")); // Duplicate

        // Iterator
        Iterator<Emp> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nContains Kiran? " + s.contains(new Emp(101, "Kiran")));
        Iterator<Emp> it2 = s.iterator();
        while (it2.hasNext()) {
            Emp e = it2.next(); // Get the current Emp object
            if (e.name.equals("Kiran")) { // Use equals method to compare strings
                System.out.println("Kiran is Present in List");
            }
        }

        System.out.println("\n" + s.size());
        System.out.println(s.isEmpty());

        // Remove Sam
        System.out.println("\nRemove:");
        s.removeIf(n -> n.name.equals("Sam"));
        System.out.println(s);

        // Clone
        Set<Emp> s3 = new HashSet<>(s);
        System.out.println("Clonning: " + s3);

        // to array
        Emp[] arr = s.toArray(new Emp[0]);
        System.out.println(arr);
        System.out.println("\nTo Array Conversion:");
        for (Emp i : arr) {
            System.out.print(i + ", ");
        }

        // For Each
        System.out.println("\nFor Each");
        s.forEach(n -> System.out.println(n));
    }
}
