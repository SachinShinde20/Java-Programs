
//Keys and Value pair, Keys are unique
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class P1 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(101, "Rahul");
        map.put(105, "Samarth");
        map.put(103, "Kartik");
        map.put(102, "Viraj");
        map.put(104, "Navin");

        System.out.println(map);

        // Contain and size
        System.out.println("\nContain Key 105: " + map.get(101)); // Onlu work for Key
        System.out.println("\nContain Key 105: " + map.containsKey(105));
        System.out.println("Contain Value \"Samarth\": " + map.containsValue("Samarth"));
        System.out.println("Map Size: " + map.size());
        System.out.println("is Empty: " + map.isEmpty());

        // Used to Remove
        map.remove(105, "Atharv");

        // if element is present modifies it, if element is not present then it add it.
        map.put(105, "Atharv");

        // if element is not present then it add it. if present leave it.
        map.putIfAbsent(105, "Karan");

        System.out.println(map);

        // Key into Set
        System.out.println("\nKays into the Collection:");
        Set<Integer> rollCall = map.keySet(); // Retrieves all the keys in the map
        System.out.println("Roll Call Set: " + rollCall);

        Collection<String> names = map.values(); // Retrieves all the values in the map
        System.out.println("Name Collection: " + names);

        Set<Map.Entry<Integer, String>> entriSet = map.entrySet(); // Retrieves all key-value pairs
        System.out.println(entriSet);
    }
}