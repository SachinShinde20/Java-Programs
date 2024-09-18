import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P4 {
    public static void main(String[] args) {

        // Make Syncronized ArrayList
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("Atharv");
        list.add("Ganesh");
        list.add("Bhargav");
        list.add("Pranav");
        list.add("Vaibhav");

        System.out.println("ArrayList: " + list);

        Collections.sort(list);
        System.out.println("\nArrayList in Ascending Order: \n" + list);
    }
}
