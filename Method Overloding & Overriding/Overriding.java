class Parent {
    public void Show() {
        System.out.println("Made By: Parent Class");
    }
}

class Child extends Parent {
    public void Show() {
        System.out.println("Made By: Child Class");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Child child = new Child();
        child.Show();
    }
}
