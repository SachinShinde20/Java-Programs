import java.util.LinkedList;
import java.util.Queue;

class Queue_P2 {
    public static void main(String[] args) {

        Queue<Info> queue = new LinkedList<>();
        queue.add(new Info(101, "Radhika"));
        queue.add(new Info(102, "Shreya"));
        queue.add(new Info(103, "Anita"));
        queue.add(new Info(104, "Shruti"));

        System.out.println(queue);

        System.out.println("\nFirst: " + queue.peek());
        System.out.println("Removed the first: " + queue.poll());
        System.out.println("First: " + queue.peek());

        System.out.println("\nContains \"Anita\": " + queue.contains(new Info(103, "Anita")));

        // Adds element and return True if element is not added Return False
        System.out.println(queue.offer(new Info(105, "Kavya")));

        System.out.println("\nNew Queue: " + queue);

        // Removed Entire Queue
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);
    }
}
