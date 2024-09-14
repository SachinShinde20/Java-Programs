package Tools;

public class Math {
    public static double add(double n1, double n2) {
        return n1 + n2;
    }

    public static double sub(double n1, double n2) {
        return n1 - n2;
    }

    public static double mul(double n1, double n2) {
        return n1 * n2;
    }

    public static double div(double n1, double n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return n1 / n2;
    }

    public static double mod(double n1, double n2) {
        return n1 % n2;
    }

    public static void showTable(double n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(n * i);
        }
    }
}
