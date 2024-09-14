import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileInputOutputStream {
    public static void main(String[] args) {

        // Used ArrayList to Store Data
        ArrayList<Integer> arr = new ArrayList<>();
        File f = null;

        try {
            f = new File("img1.jpg");

            /*********************
             * Read
             ***********************/
            // Read Data from img1 and store into array
            FileInputStream fInputStream = new FileInputStream(f);
            int data;
            System.out.println("No. of Bytes: " + fInputStream.available());
            while ((data = fInputStream.read()) != -1) {
                arr.add(data);
            }
            System.out.println("Remaining Bytes: " + fInputStream.available());
            fInputStream.close();
            System.out.println("Data Sucessfully Copied");

            /*********************
             * Write
             ***********************/
            // 'NewlyCreatedImage' image is generated using the data inside of array
            FileOutputStream fOutputStream = new FileOutputStream("NewlyCreatedImage.jpg");
            for (Integer i : arr) {
                fOutputStream.write(i);
            }
            fOutputStream.close();
            System.out.println("\nData Sucessfully Pasted");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
