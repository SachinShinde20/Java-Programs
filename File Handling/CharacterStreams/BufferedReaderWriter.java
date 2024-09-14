import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriter {
    public static void main(String[] args) {
        File f = null;

        try {
            f = new File("BufferedReaderWriter.txt");

            if (!f.exists()) {
                System.out.println("File created: " + f.createNewFile());
            } else {
                System.out.println("File already exists.");
            }

            /*********************
             * Write
             ***********************/
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(f));
            bWriter.write(
                    "BufferedReader and BufferedWriter: Why Are They Preferred?\nBufferedReader and BufferedWriter are buffered character stream classes that improve the performance of file operations. They wrap around FileReader and FileWriter to provide more efficient reading and writing.\n\nHow Do They Work?\nInstead of reading/writing characters one at a time, they use an internal buffer (a block of memory) to read/write larger chunks of data at once.\nThis reduces the number of times the disk is accessed (disk I/O operations), which is often slow. ");

            // Flush the buffer - ensures the data is written to the file
            bWriter.flush();

            // Finally, close the stream (automatically flushes any remaining data)
            bWriter.close();
            System.out.println("File is Written Sucessfully.");

            /*********************
             * Read
             ***********************/
            // // Method 1
            System.out.println("\nReading from File: ");
            BufferedReader bReader = new BufferedReader(new FileReader(f));
            int str;
            /*
             * The FileReader.read() method reads one character at a time and returns
             * Unicode value of the character (integer).
             * The method returns -1 when the end of the file is reached,
             */
            while ((str = bReader.read()) != -1) {
                System.out.print((char) str);
            }

            // // Method 2
            // String str2;
            // while ((str2 = bReader.readLine()) != null) {
            // System.out.print((char) str);
            // }
            bReader.close();

            // For most text file processing tasks, especially when you care about reading
            // line-based content, Method 2 (readLine()) is easier and more efficient.
            // If you need fine control over individual characters, Method 1 (read()) is
            // more appropriate, but it’s usually slower.

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}