class Math {
    static float pi = 3.14f;
}

class CircleArea {
    public float area(float radius) {
        return 2 * Math.pi * radius;
    }
}

public class StaticVariable {
    public static void main(String[] args) {

        CircleArea cArea = new CircleArea();
        float ans = cArea.area(10.5f);
        System.out.println("Area Of Circle: " + ans);
    }
}
