/* 
* There is problem with T1 and T2 they Cannot use inheritance 
* to solve the issue we use runnable interface 
*/

class C1 implements Runnable {

    @Override
    public void run() {
        T3.increment();
    }
}

class C2 implements Runnable {

    @Override
    public void run() {
        T3.increment();
    }
}

public class T3 {
    public static int count = 0;

    public static synchronized void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        C1 c1 = new C1();
        C2 c2 = new C2();

        /*
         * When you use the Runnable interface, you need to create a Thread object and
         * pass the Runnable instance to it. This is because the Runnable interface only
         * defines the run method, which contains the code that should be executed by
         * the thread. However, it does not provide the mechanism to start a new thread.
         * The Thread class, on the other hand, provides the start method, which is
         * necessary to create a new thread of execution.
         */
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();

        System.out.println("1 Count: " + count);

        t1.join(); // It will throw InterruptedException
        t2.join();

        System.out.println("2 Count: " + count);
    }
}
