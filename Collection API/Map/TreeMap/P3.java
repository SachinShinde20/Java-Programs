import java.util.Collection;
import java.util.TreeMap;

public class P3 {
    public static void main(String[] args) {

        TreeMap<Integer, Info> myMap = new TreeMap<>();
        myMap.put(0, null);
        myMap.put(1, new Info(108, "Radhika"));
        myMap.put(2, new Info(101, "Kavita"));
        myMap.put(3, new Info(107, "Priya"));
        myMap.put(4, new Info(105, "Kavya"));

        // Created Seprete Static method in Info Class for Displaying
        Info.Show(myMap);

        System.out.println("\nOperations");
        // Contain and size
        System.out.println("Contain Key 3: " + myMap.get(3)); // Onlu work for Key
        System.out.println("Contain Key 4: " + myMap.containsKey(4));
        System.out.println("Contain Value \"Priya\": " + myMap.containsValue(new Info(107, "Priya")));

        System.out.println("\nOnly Values");
        Collection<Info> names = myMap.values(); // Retrieves all the values in the map
        for (Info info : names) {
            System.out.println(info);
        }
    }
}
