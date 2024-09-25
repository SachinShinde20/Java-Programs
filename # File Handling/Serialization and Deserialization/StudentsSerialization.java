import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentsSerialization {
    public static void main(String[] args) {
        /*
         * Student Object and assigning values
         */
        Students s1 = new Students();
        s1.setId(1);
        s1.setName("Rahul Trivedi");
        s1.setDept(Dept.CSE);

        Students s2 = new Students();
        s2.setId(2);
        s2.setName("Viraj Sharma");
        s2.setDept(Dept.ELECTRIC);

        Students s3 = new Students();
        s3.setId(3);
        s3.setName("Sourabh Shelake");
        s3.setDept(Dept.CIVIL);

        File file = new File("Student_Data.txt");

        /*
         * Serialization
         * Storing Object in File
         */
        try (
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream ios = new ObjectOutputStream(fos);) {

            ios.writeObject(s1);
            ios.writeObject(s2);
            ios.writeObject(s3);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        /*
         * Deserialization
         * Retrieving Object from File
         */
        try (
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);) {

            Students sObj1 = (Students) ois.readObject();
            System.out.println("Id : " + sObj1.getId());
            System.out.println("Name : " + sObj1.getName());
            System.out.println("Department : " + sObj1.getDept());
            System.out.println();

            Students sObj2 = (Students) ois.readObject();
            System.out.println("Id : " + sObj2.getId());
            System.out.println("Name : " + sObj2.getName());
            System.out.println("Department : " + sObj2.getDept());
            System.out.println();

            Students sObj3 = (Students) ois.readObject();
            System.out.println("Id : " + sObj3.getId());
            System.out.println("Name : " + sObj3.getName());
            System.out.println("Department : " + sObj3.getDept());
            System.out.println();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
