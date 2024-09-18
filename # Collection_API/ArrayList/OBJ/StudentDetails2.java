import java.util.ArrayList;
// import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

class Students {
    int rollNo;
    String name;
    int marks;

    Students(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Used to print the Arraylist
    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
}

class StudentDetails2 {
    public static void main(String[] args) {

        ArrayList<Students> list = new ArrayList<>();
        list.add(new Students(5, "Amae", 76));
        list.add(new Students(1, "Mohini", 60));
        list.add(new Students(8, "Viraj", 66));
        list.add(new Students(3, "Raj", 97));
        list.add(new Students(10, "Swapnil", 89));

        // Useing By Overing To String
        System.out.println();
        for (Students s : list) {
            System.out.println(s);
        }

        // Printing According to the marks
        System.out.println("\nSort According Marks");
        Comparator<Students> com = new Comparator<Students>() {
            @Override
            public int compare(Students s1, Students s2) {
                // return (s1.marks < s2.marks) ? -1 : 1;
                return s1.name.compareTo(s2.name);
            }
        };
        Collections.sort(list, com);

        for (Students s : list) {
            System.out.println(s);
        }
    }
}