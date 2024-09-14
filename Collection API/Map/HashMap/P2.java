import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;

public class P2 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(15);
        l.add(20);

        List<String> l2 = new ArrayList<>();
        l2.add("Apple");
        l2.add("Banana");
        l2.add("Grapes");

        HashMap<Integer, String> m = new HashMap<>();
        for (int i = 0; i < l.size(); i++) {
            m.put(l.get(i), l2.get(i));
        }
        System.out.println(m);

        // computeIfAbsent
        // // Adds a new entry if Key is absent
        m.computeIfAbsent(10, v -> "Dragon Fruit"); // x
        m.computeIfAbsent(100, v -> "Orange");
        System.out.println("\n" + m + "\n");

        // computeIfPresent
        // // Updates value if "Value" if present
        m.computeIfPresent(200, (k, v) -> v = "Dragon Fruit"); // x
        m.computeIfPresent(100, (k, v) -> v = "Avacado");
        System.out.println(m + "\n");

        // For Each
        System.out.println("ForEach");
        m.forEach((k, v) -> {
            if (k % 2 == 0)
                System.out.print("Even:: ");
            else
                System.out.print("Odd:: ");
            System.out.println("Key: " + k + ", Value: " + v);
        });
    }
}
