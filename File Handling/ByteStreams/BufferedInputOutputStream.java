import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.ArrayList;

public class BufferedInputOutputStream {
    public static void main(String[] args) {

        File f = null;
        ArrayList<Integer> arr = new ArrayList<>();

        try {
            f = new File("img1.jpg");

            /*********************
             * Read
             ***********************/
            BufferedInputStream bInputStream = new BufferedInputStream(new FileInputStream(f));
            int data;
            while ((data = bInputStream.read()) != -1) {
                arr.add(data);
            }
            bInputStream.close();
            System.out.println("Image is Copied");

            /*********************
             * Write
             ***********************/
            BufferedOutputStream bOutputStream = new BufferedOutputStream(
                    new FileOutputStream("NewlyCreatedImage2.jpg"));
            for (Integer i : arr) {
                bOutputStream.write(i);
            }

            // Flush the buffer - ensures the data is written to the file
            bOutputStream.flush();

            // Finally, close the stream (automatically flushes any remaining data)
            bOutputStream.close();
            System.out.println("Image Pasted Sucessfully.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}