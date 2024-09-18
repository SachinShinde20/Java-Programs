public class Emp implements Comparable<Emp> {
    int id;
    String name;

    Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Roll No: " + id + ", Name: " + name;
    }

    @Override
    public int compareTo(Emp e) {
        if (this.id > e.id)
            return 1; // Swap
        else
            return -1;
    }
}
