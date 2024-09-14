import java.io.File;
import java.io.IOException;
import java.util.Date;

class P1 {
    public static void main(String[] args) {

        File f = new File("Demo_1.txt");
        try {
            if (f.createNewFile())
                System.out.println("File is Created.");
            else
                System.out.println("File is already Exist...");
        } catch (IOException e) {
            System.out.println("Error Occured: \n" + e.getMessage());
        }

        System.out.println("\nName of File: " + f.getName());
        System.out.println("Absolute Path: " + f.getAbsolutePath());
        System.out.println("Exist? : " + f.exists());

        System.out.println("\nCan Read : " + f.canRead());
        System.out.println("Can Write : " + f.canWrite());
        System.out.println("Can Execute? : " + f.canExecute());
        System.out.println("Length : " + f.length());

        Date time = new Date(f.lastModified()); // giev time in miliseconds from 1 Jan 1970, 12 AM
        System.out.println("\nLast Modified : " + time); // Convert into human readable time

        File f2 = new File("Demo_2.txt");
        // If destination file is already present then it does not do anything
        System.out.println("Rename : " + f.renameTo(f2));
        f = f2;
        System.out.println("Name of File: " + f.getName());

        System.out.println("\nis File? : " + f.isFile());
        System.out.println("is isDirectory? : " + f.isDirectory());
        System.out.println("is Hidden? : " + f.isHidden());

        System.out.println("\nString : " + f.toString());
        System.out.println("Path : " + f.toPath());
        System.out.println("Url : " + f.toURI());
    }
}