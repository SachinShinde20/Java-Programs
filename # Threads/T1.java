class A1 extends Thread {
    public void run() {
        T1.increment();
    }
}

class A2 extends Thread {
    public void run() {
        T1.increment();
    }
}

public class T1 {
    static int count = 0;

    public static void increment() {
        for (int i = 0; i < 100000; i++) {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        A1 a1 = new A1();
        A2 a2 = new A2();

        a1.start();
        a2.start();

        /*
         * if we try to Print the count now, (The Race condition problem 1 ocuures here)
         * Resultiong The count to b1 0.
         */
        System.out.println("1 Count: " + count);

        /*
         * Above Problem is solved here
         *
         * Now the count is not 0, but still the count is not accurate,
         * (Accurate value = 20000)
         * This proble is solved in T2.java
         */
        a1.join(); // throws InterruptedException
        a2.join();

        System.out.println("2 Count: " + count);
    }
}
