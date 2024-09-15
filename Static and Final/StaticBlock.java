class Demo {
    // Static Variable Declaration
    static int no;
    static String str;

    // Static Block variables are initialized only once when the class is loaded
    static {
        System.out.println("Static Block is Called...\n");
        no = 20;
        str = "Hi";
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println(Demo.no);
        System.out.println(Demo.str);
    }
}
