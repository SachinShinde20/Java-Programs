import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(7);
        arrList.add(12);
        arrList.add(4);
        arrList.add(19);

        System.out.println(arrList);

        System.out.println("Size: " + arrList.size());

        System.out.println("\nArrayList using for loop");
        for (int i = 0; i < 5; i++) {
            System.out.println(arrList.get(i));
        }

        System.out.println("\nRemoved Element: " + arrList.remove(0));
        System.out.println("Now Array: " + arrList);

        System.out.println("\nRemoved element: " + arrList.set(3, 15));
        System.out.println("Replaced 19 with 15: " + arrList);

        System.out.println("\nEmpty: " + arrList.isEmpty());
        arrList.addFirst(0);
        arrList.addLast(20);
        System.out.println("New arrlist: " + arrList);
        System.out.println("First: " + arrList.getFirst());
        System.out.println("Last: " + arrList.getLast());

        System.out.println("\nHashCode: " + arrList.hashCode());
        System.out.println("Index of 20 is : " + arrList.indexOf(20));

        System.out.println("\nIndex 3 removed: " + arrList.remove(3));
        System.out.println(arrList);
    }
}