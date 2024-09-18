class P1 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Current active threads are: " + Thread.activeCount());

        System.out.println("Current Thread Name: " + Thread.currentThread().getName());
        System.out.println("Current Thread Priority: " + Thread.currentThread().getPriority());

        System.out.println("is Thread alive? " + Thread.currentThread().isAlive());

        // Current Thread Name and Priority Changed
        Thread.currentThread().setName("P1");
        Thread.currentThread().setPriority(9);
        System.out.println("\nCurrent Thread new Name: " + Thread.currentThread().getName());
        System.out.println("Current Thread new Priority: " + Thread.currentThread().getPriority());

        // for loop
        System.out.println("\nFor Loop");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); // it will throw InterruptedException
        }
    }
}