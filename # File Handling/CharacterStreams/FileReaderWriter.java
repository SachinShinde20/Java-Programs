// for Small text files Use FileReader and FileWriter for simplicity

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) {

        File f = null;
        FileWriter fWriter = null;
        FileReader fReader = null;

        try {
            f = new File("FileReaderWriter.txt");

            if (!f.exists()) {
                System.out.println("File created: " + f.createNewFile());
            } else {
                System.out.println("File already exists.");
            }

            /*********************
             * Write
             ***********************/
            fWriter = new FileWriter(f);
            fWriter.write("Hello This is My First File\nThis is new Line.");
            fWriter.close();
            System.out.println("File is Sucessfully Written");

            /*********************
             * Read
             ***********************/
            System.out.println("\nReading From File:");

            fReader = new FileReader(f);

            System.out.println("FileWriter Ready? " + fReader.ready());
            int Unicode;
            /*
             * The FileReader.read() method reads one character at a time and returns
             * Unicode value of the character (integer).
             * The method returns -1 when the end of the file is reached,
             */
            while ((Unicode = fReader.read()) != -1) {
                System.out.print((char) Unicode); // Converted Byte into Character
            }
            fReader.close();
        } catch (IOException e) {
            System.out.println("error\n" + e.getMessage());
        }
    }
}