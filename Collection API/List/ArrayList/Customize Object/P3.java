import java.util.ArrayList;
import java.util.Collections;

public class P3 {
    public static void main(String[] args) {

        ArrayList<Emp> l = new ArrayList<>();

        l.add(new Emp(108, "Aarav Mehta"));
        l.add(new Emp(220, "Priya Sharma"));
        l.add(new Emp(138, "Maya Kapoor"));
        l.add(new Emp(721, "Kabir Singh"));
        l.add(new Emp(543, "Ishaan Mehta"));
        l.add(new Emp(328, "Albert Roy"));

        // Printing The List
        System.out.println("List: ");
        for (Emp emp : l) {
            System.out.println(emp);
        }

        // Check Emp class for understanding
        Collections.sort(l);

        // Printing The List
        System.out.println("\nList after swap:");
        System.out.println("List: ");
        for (Emp emp : l) {
            System.out.println(emp);
        }
    }
}
