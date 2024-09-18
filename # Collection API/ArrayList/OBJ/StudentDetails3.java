import java.util.ArrayList;
import java.util.Collections;

class Students implements Comparable<Students> {
    int rollNo;
    String name;
    int marks;

    Students(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Funtion to print an ArrayList
    public static void show(ArrayList<Students> l) {
        System.out.println();
        for (Students s : l) {
            System.out.println("Roll No: " + s.rollNo + ", Name: " + s.name + ", Marks: " + s.marks);
        }
    }

    public int compareTo(Students s) {
        return (this.marks < s.marks) ? -1 : 1;
    }
}

public class StudentDetails3 {
    public static void main(String[] args) {

        ArrayList<Students> l = new ArrayList<>();
        l.add(new Students(5, "Amae", 76));
        l.add(new Students(1, "Mohini", 60));
        l.add(new Students(8, "Viraj", 66));
        l.add(new Students(3, "Raj", 97));
        l.add(new Students(10, "Swapnil", 89));

        // Funtion Call
        Students.show(l);

        // Sort according to the Marks
        Collections.sort(l);
        Students.show(l);

    }
}
