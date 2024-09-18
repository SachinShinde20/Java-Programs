import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueue_P4 {
    public static void main(String[] args) {

        Deque<Info> queue = new ArrayDeque<>();
        queue.add(new Info(101, "Radhika"));
        queue.add(new Info(102, "Shreya"));
        queue.add(new Info(103, "Anita"));
        queue.add(new Info(104, "Shruti"));
        System.out.println(queue);

        System.out.println("\nFirst: " + queue.getFirst());
        System.out.println("Last: " + queue.getLast());
        System.out.println("Contains Shreya: " + queue.contains(new Info(102, "Shreya")));

        System.out.println("\nRemove First: " + queue.pollFirst());
        System.out.println("Remove Last: " + queue.pollLast());
        System.out.println("New Queue: " + queue);

        System.out.println(queue.offerFirst(new Info(105, "Kavya")));
        System.out.println(queue.offerLast(new Info(106, "Sanika")));
        System.out.println("New Queue: " + queue);

    }
}
