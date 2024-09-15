// Final Class Cannot be Extended By Any Other Class
final class Ex1 {
    int n = 100;
}

class Ex2 {
    // A final method cannot be overridden by any subclass.
    // By preventing overriding, final methods can help maintain the security and
    // reliability of a class’s behavior.
    public final int add(int n1, int n2) {
        return n1 + n2;
    }

    public final int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

public class FinalClass {
    public static void main(String[] args) {

        // Cannot Change the Final variable
        final double pi = 3.14;
        System.out.println(pi);

        Ex2 ex2 = new Ex2();
        System.out.println(ex2.add(10, 10));
        System.out.println(ex2.add(10, 10, 30));
    }
}
