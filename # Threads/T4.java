public class T4 {
    public static void main(String[] args) {

        // Runnable run1 and Runnable run2: These are lambda expressions implementing
        // the Runnable interface
        Runnable run1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("This is Thread 1: " + i);
            }
        };

        Runnable run2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread 2: " + i);
            }
        };

        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);

        t1.start();
        t2.start();
    }
}