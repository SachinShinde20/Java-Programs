public class TypeCasting {
    public static void main(String[] args) {
        // Implicit TypeCasting
        System.out.println("\nImplicit TypeCasting");
        byte b = 10;
        int i = b;
        System.out.println("Value of i is: " + i);

        // Explicit TypeCasting
        System.out.println("\nExplicit TypeCasting");
        int x = 100;
        byte y = (byte) x;
        System.out.println("Value of y is: " + y);

        float m = 75.12345f;
        int n = (int) m;
        System.out.println("\nValue of n is: " + n);

        // The size of Number is Greter than the rang of Byte
        // No % range of Datatype to convert
        // No % 256
        int no1 = 257;
        byte no2 = (byte) no1;
        System.out.println("\nValue of No2 is: " + no2);

        // Type Pramotion (Byte) + (Byte) = (int)
        System.out.println("\nType Pramotion");
        byte num1 = 100;
        byte num2 = 100;
        System.out.println("num1 + num2 : " + num1 + num2);

    }
}
