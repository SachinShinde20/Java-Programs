// Same method in two Diffrent Class
class A {
    public static void show() {
        System.out.println("Class A");
    }
}

class B {
    public static void show() {
        System.out.println("Class B");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        A.show();
        B.show();
    }
}
