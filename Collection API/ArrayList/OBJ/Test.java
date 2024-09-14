import java.util.ArrayList;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public static void Show(ArrayList<Student> l1) {
        for (Student s : l1) {
            System.out.print(s.rollNo + ", ");
            System.out.print(s.name + ", ");
            System.out.print(s.marks + "\n");
        }
    }
}

class Test {
    public static void main(String[] args) {

        ArrayList<Student> l1 = new ArrayList<>();

        Student s1 = new Student(1, "Om", 91);
        Student s2 = new Student(2, "Deva", 68);
        Student s3 = new Student(3, "Ritesh", 78);
        Student s4 = new Student(4, "Sahil", 60);
        Student s5 = new Student(5, "Sachin", 85);
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);
        l1.add(s4);
        l1.add(s5);

        System.out.println("\nStudent Details are: ");
        Student.Show(l1);

        l1.removeIf(s -> s.marks < 80);
        System.out.println();
        Student.Show(l1);
    }
}
