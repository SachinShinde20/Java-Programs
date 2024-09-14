import java.io.File;
import java.io.IOException;

public class P2 {
    public static void main(String[] args) {

        File f = new File("Abc.txt");
        try {
            if (f.createNewFile())
                System.out.println("File is Created.");
            else
                System.out.println("File is already Exist...");
        } catch (IOException e) {
            System.out.println("Error Occured: \n" + e.getMessage());
        }

        f.setReadOnly();
        System.out.println("\nCan Read : " + f.canRead()); // True
        System.out.println("Can Write : " + f.canWrite()); // False
        System.out.println("Can Execute? : " + f.canExecute()); // True
    }
}
