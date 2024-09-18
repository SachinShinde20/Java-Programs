import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueue_P3 {
    public static void main(String[] args) {

        Deque<String> queue = new ArrayDeque<>();
        queue.add("Rakesh");
        queue.add("Navin");
        queue.addFirst("Sam");
        queue.addLast("Albert");

        System.out.println(queue);

        System.out.println("\nFirst: " + queue.getFirst());
        System.out.println("Last: " + queue.getLast());
        System.out.println("Contains Rakesh: " + queue.contains("Rakesh"));

        System.out.println("\nRemove First: " + queue.pollFirst());
        System.out.println("Remove Last: " + queue.pollLast());
        System.out.println("New Queue: " + queue);

        System.out.println(queue.offerFirst("King"));
        System.out.println(queue.offerLast("Queen"));
        System.out.println("New Queue: " + queue);

    }
}
