class B1 extends Thread {
    public void run() {
        T2.increment();
    }
}

class B2 extends Thread {
    public void run() {
        T2.increment();
    }
}

public class T2 {
    static int count = 0;

    /*
     * To solve the above problem we need to use Synchronize keyword in the method
     * so that only one thread can access it
     */
    public static synchronized void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        B1 b1 = new B1();
        B2 b2 = new B2();

        b1.start();
        b2.start();

        System.out.println("1 Count: " + count);

        b1.join();
        b2.join();

        System.out.println("\nThread execution b1 Name: " + b1.getName());
        System.out.println("Thread execution b1 Priority: " + b1.getPriority());

        System.out.println("\nThread execution b2 Name: " + b2.getName());
        System.out.println("Thread execution b2 Priority: " + b2.getPriority());

        System.out.println("\n2 Count: " + count);
    }
}
