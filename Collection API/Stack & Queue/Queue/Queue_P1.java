import java.util.LinkedList;
import java.util.Queue;

class Queue_P1 {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("Rakesh");
        queue.add("Navin");
        queue.add("Sam");
        queue.add("Albert");

        System.out.println(queue);

        System.out.println("First: " + queue.peek());
        System.out.println("Removed the first: " + queue.poll());
        System.out.println("First: " + queue.peek());

        System.out.println("\nContains \"Sam\": " + queue.contains("Sam"));
        System.out.println(queue.offer("King")); // Adds element and return True if element is not added Return False

        System.out.println("\nNew Queue: " + queue);

        // Removed Entire Queue
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);
    }
}