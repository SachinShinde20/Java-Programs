import java.io.File;

public class P3 {
    public static void main(String[] args) {
        // Used to crete single folder
        File folder = new File("Demo");
        System.out.println(folder.mkdir());

        // Used to Created Nested Folder
        File folder2 = new File("Folder 1\\Folder 2\\Folder 3");
        System.out.println(folder2.mkdirs());

        // Used to Delete the Folder
        // System.out.println("Deleting File: " + folder.delete());
    }
}
