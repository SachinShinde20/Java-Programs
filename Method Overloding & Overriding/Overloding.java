class Addition {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

public class Overloding {
    public static void main(String[] args) {

        Addition addition = new Addition();

        System.out.println(addition.add(10, 15));
        System.out.println(addition.add(10, 15, 20));
    }
}