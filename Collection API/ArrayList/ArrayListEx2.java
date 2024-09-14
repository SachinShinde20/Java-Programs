import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(21);
        arrayList2.add(14);
        arrayList2.add(40);
        arrayList2.add(32);
        arrayList2.add(92);
        System.out.println("Array 1: " + arrayList2);

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(51);
        arrayList3.add(84);
        arrayList3.add(72);
        arrayList3.add(92);
        System.out.println("Array 2: " + arrayList3);

        // Default it add in the last
        // arrayList2.addAll(arrayList3);
        arrayList2.addAll(2, arrayList3);
        System.out.println("\nArray 1 after adding arr 3 in it: \n" + arrayList2);

        // search from last (92)
        System.out.println("position of 91 from last: " + arrayList2.lastIndexOf(92));

        // converting in to the array
        Object arr[] = arrayList2.toArray();
        System.out.println("\nConverted in to the array");
        for (Object o : arr) {
            System.out.print(o + ", ");
        }

        // subList form 2 to end.
        List<Integer> List = arrayList2.subList(2, arrayList2.size());
        System.out.println("\n\nArrayList convered in to the list (From 2 to end): \n" + List);

        // Copy
        @SuppressWarnings("unchecked")
        ArrayList<Integer> clonedArrayList = (ArrayList<Integer>) arrayList2.clone();
        System.out.println("\nCloned list: \n" + clonedArrayList);

        // Equal to
        System.out.println("\nChecking equals to: " + arrayList2.equals(clonedArrayList));
        System.out.println("\nChecking equals to: " + arrayList2.equals(arrayList3));
    }
}